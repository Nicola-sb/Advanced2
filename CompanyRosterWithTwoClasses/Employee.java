package CompanyRosterWithTwoClasses;

public class Employee {
    private String name;

    public double getSalary() {
        return this.salary;
    }

    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    public Employee(String name,double salary,String position,String department){
        this.name=name;
        this.salary=salary;
        this.position=position;
        this.department=department;
        this.age=-1;
        this.email="n/a";
    }
    public Employee(String name,double salary,String position,String department,String email){
        this.name=name;
        this.salary=salary;
        this.position=position;
        this.department=department;
        this.email=email;
        this.age=-1;
    }
    public Employee(String name,double salary,String position,String department,int age){
        this.name=name;
        this.salary=salary;
        this.position=position;
        this.department=department;
        this.age=age;
        this.email="n/a";
    }
    public Employee(String name,double salary,String position,String department,String email,int age){
        this.name=name;
        this.salary=salary;
        this.position=position;
        this.department=department;
        this.email=email;
        this.age=age;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d",name,salary,email,age);
    }

}
