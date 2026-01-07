import java.util.HashMap;
import java.util.Map;

public class Company {

    Map<Integer, Employee> employees = new HashMap<>();
    
    public void addEmployeeToComapany(String name, String surename, String salary){
        employees.put(employees.size(),new Employee(name,surename,salary));
    }
    
    public void searchEmployee(String name, String surename){
        boolean answer = false;
        
        for(Employee emp : employees.values()){
            if(emp.getName().equals(name) & emp.getSurename().equals(surename)){
                System.out.println("That person is working for us!!");
                System.out.println(emp.toString());
                break;
            }else{
                answer = true;
            }
            if(answer){
                System.out.println("We don`t have that person in our data base!");
            }
        }
    }
}