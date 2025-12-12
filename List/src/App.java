import tkinter as tk
from tkinter import filedialog, messagebox
from tkinter import ttk
import subprocess
import threading
import psutil   # potrzebne do wykrywania dysków

def browse_file():
    filename = filedialog.askopenfilename(
        title="Wybierz plik QCOW2",
        filetypes=[("QCOW2 files", "*.qcow2"), ("All files", "*.*")]
    )
    if filename:
        entry_file.delete(0, tk.END)
        entry_file.insert(0, filename)

def detect_devices():
    devices = []
    for part in psutil.disk_partitions(all=True):
        # np. /dev/sda1, /dev/sdb
        if part.device.startswith("/dev/"):
            devices.append(part.device)
    return devices

def run_qemu(qcow_file, device):
    try:
        cmd = ["sudo", "qemu-img", "convert", "-p", qcow_file, "-O", "raw", device]
        process = subprocess.Popen(cmd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, text=True)

        for line in process.stdout:
            if "%" in line:
                try:
                    percent = int(line.strip().replace("%", ""))
                    progress_var.set(percent)
                except ValueError:
                    pass

        process.wait()
        subprocess.run(["sync"])
        messagebox.showinfo("Sukces", f"Obraz {qcow_file} został zapisany na {device}.")
    except Exception as e:
        messagebox.showerror("Błąd", f"Wystąpił problem: {e}")
    finally:
        progress_var.set(0)

def write_image():
    qcow_file = entry_file.get()
    device = device_var.get()

    if not qcow_file or not device:
        messagebox.showerror("Błąd", "Podaj plik QCOW2 i wybierz urządzenie docelowe.")
        return

    threading.Thread(target=run_qemu, args=(qcow_file, device), daemon=True).start()

# GUI
root = tk.Tk()
root.title("QCOW2 Disk Writer")
root.geometry("500x200")
root.resizable(False, False)

frame = tk.Frame(root, padx=10, pady=10)
frame.pack(fill="both", expand=True)

progress_var = tk.IntVar()
progress_bar = ttk.Progressbar(frame, orient="horizontal", length=450, mode="determinate", variable=progress_var, maximum=100)
progress_bar.grid(row=0, column=0, columnspan=3, pady=(0,10))

tk.Label(frame, text="Plik QCOW2:").grid(row=1, column=0, sticky="w")
entry_file = tk.Entry(frame, width=40)
entry_file.grid(row=1, column=1)
tk.Button(frame, text="Przeglądaj", command=browse_file).grid(row=1, column=2)

tk.Label(frame, text="Urządzenie docelowe:").grid(row=2, column=0, sticky="w")
device_var = tk.StringVar()
devices = detect_devices()
device_dropdown = ttk.Combobox(frame, textvariable=device_var, values=devices, width=37)
device_dropdown.grid(row=2, column=1)

tk.Button(frame, text="Zapisz obraz", command=write_image).grid(row=3, column=1, pady=10)

root.mainloop()
