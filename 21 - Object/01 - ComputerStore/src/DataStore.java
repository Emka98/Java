class DataStore {

    private static final int NUMEBER_OF_COMPUTERS = 10;
    private int current_numbers_of_notebooks = 0;

    private Computer[] notebokosData = new Computer[NUMEBER_OF_COMPUTERS];
    
    public void add(Computer comp){
        notebokosData[current_numbers_of_notebooks] = comp; 
        current_numbers_of_notebooks += 1;
    }

    public void ability(Computer computer){
        int amount_of_that_computers = 0;
        for (Computer comp : notebokosData){
            if (computer.equals(comp)){
                amount_of_that_computers += 1;
            }
        }
        System.out.printf("Amount of the %s in shop is %d",computer.toString(), amount_of_that_computers);
    }
}