import java.io.Serial;
import java.io.Serializable;

class Company implements Serializable{
    @Serial
    private static final long serialVersionUID = 3812017177088226528L;

    private static final int MAX_EMPLOYEE = 3; 
    private Employee[] tab = new Employee[MAX_EMPLOYEE];
    private int numberEmployee = 0;

    void addEmployee(Employee emp){
        if(numberEmployee <= MAX_EMPLOYEE){
            tab[numberEmployee] = emp; 
            numberEmployee ++;
        } else {
            System.out.println("The comapany is overloead");
        }
    }

    void showEmployee(){
        for(Employee emp: tab){
            if(emp != null){
                System.out.println(emp.toString()); 
            }
        }
    }
}