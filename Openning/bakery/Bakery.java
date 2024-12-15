package Openning.bakery;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bakery {
    //Next, write a Java class Bakery that has employees (a collection, which stores the entity Employee).
    // All entities inside the repository have the same properties. Also, the Bakery class should have those properties:
    //•	name: String
    //•	capacity: int
    private List<Employee>myEmployees;
    private String name;
    private int capacity;
    //The class constructor should receive the name and capacity, also it should initialize the employees
    // with a new instance of the collection. Implement the following features:

    public Bakery(String name, int capacity) {
        this.myEmployees = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    //•	Field employees – List that holds added Employees
    //•	Method add(Employee employee) – adds an entity to the data if there is room for him/her.
    //•	Method remove(String name) – removes an employee by given name, if such exists, and returns a bool.
    //•	Method getOldestEmployee() – returns the oldest employee.
    //•	Method getEmployee(string name) – returns the employee with the given name.
    //•	Getter getCount() – returns the number of employees.
    public void add(Employee employee){
        if(myEmployees.size() < this.capacity){
            myEmployees.add(employee);
        }
    }
    //•	Method remove(String name) – removes an employee by given name, if such exists, and returns a bool.
    public boolean remove(String name){
       if(myEmployees.contains(name)){
           return true;
       }
       return false;
    }
    ////•	Method getOldestEmployee() – returns the oldest employee.
    public Employee getOldestEmployee(){
        return myEmployees.stream().max(Comparator.comparingInt(Employee::getAge)).orElse(null);
    }
    //•	Method getEmployee(string name) – returns the employee with the given name.
    public Employee getEmployee(String name){
        return myEmployees.stream().filter(empl -> empl.getName().equals(name)).findFirst().orElse(null);
    }
    ////•	Getter getCount() – returns the number of employees.
    public int getCount(){
        return myEmployees.size();
    }
    //•	report() – returns a string in the following format:
    //o	"Employees working at Bakery {bakeryName}:
    //{Employee1}
    //{Employee2}
    //(…)"
    public String report(){
        StringBuilder builder=new StringBuilder();
        builder.append(String.format("Employees working at Bakery %s:",name)).append(System.lineSeparator());
        for (Employee employee:myEmployees){
            builder.append(employee).append(System.lineSeparator());
        }
        return builder.toString();
    }

}
