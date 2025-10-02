public class HospitalApp {
    public static void main(String[] args) throws Exception {
    
        Nurse nurse1 = new Nurse("Kamila", "P", 1000000, 0); 
        Nurse nurse2 = new Nurse("Kasia", "P", 1000000, 0);         
        Doctor doctor1 = new Doctor("Emil", "G", 100000000, 15252525);
        Hospial hospial1 = new Hospial();

        hospial1.addPerson(doctor1);
        hospial1.addPerson(nurse1);
        hospial1.addPerson(nurse2);

        hospial1.getInfo();




        
    

        
    }
}
