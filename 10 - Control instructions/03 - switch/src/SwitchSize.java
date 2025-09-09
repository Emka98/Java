import java.util.Scanner;

class SwitchSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size S, M, L or XL");
        String shortSize = scanner.nextLine();
        String size;
        switch (shortSize) {
            case "S":
                size = "small";
                break;
            case "M":
                size = "medium";
                break;
            case "L":
                size = "large";
                break;
            case "XL":
                size = "extra large";
                break;
            default:
                size = "unknown";
        }
        System.out.println("Selected size: " + size);
    }
}
