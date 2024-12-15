package ComapnyRosterAlone;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Your task is to write a program that takes N lines of information about employees from the console and calculates the department
        // with the highest average salary and prints for each employee in that department his name, salary, email, and age - sorted by salary in descending order.

        Map<String, List<Employee>>employeeList=new HashMap<>();
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1 ;i<=n ;i++){
            //Peter 120.00 Dev Development peter@abv.bg 28
            String []companyData=scanner.nextLine().split("\\s+");
            String name=companyData[0];
            double salary=Double.parseDouble(companyData[1]);
            String position=companyData[2];
            String department=companyData[3];

            Employee employee=null;

            if(companyData.length==6){
                String email=companyData[4];
                int age=Integer.parseInt(companyData[5]);
                employee=new Employee(name,salary,position,department,email,age);
            }else if(companyData.length==4){
                employee=new Employee(name,salary,position,department);

            }else if(companyData.length==5){
                String possible5=companyData[4];
                if(possible5.contains("@")){
                    String email=possible5;
                    employee=new Employee(name,salary,position,department,email);
                }else{
                    int age=Integer.parseInt(companyData[4]);
                    employee=new Employee(name,salary,position,department,age);
                }
            }
            if(!employeeList.containsKey(department)){
                employeeList.put(department,new ArrayList<>());
                //Трябва да си взема стойстта,която е срещу dertment и да я добавя към списък
                employeeList.get(department).add(employee);
            }else{
                employeeList.get(department).add(employee);
            }

        }

          String averageMaxDepartmentSalary=employeeList.entrySet().stream().max(Comparator.comparingDouble(entry -> getAverageSalary(entry.getValue()))).get().getKey();

        System.out.printf("Highest Average Salary: %s%n",averageMaxDepartmentSalary);

         List<Employee>employeeList1=employeeList.get(averageMaxDepartmentSalary);
         //Получил съм си листа с отделът със служителите с най-висока заплата и трябва да ги принтирам в descending order
         employeeList1.sort(Comparator.comparingDouble(entry -> entry.getSalary()));
         Collections.reverse(employeeList1);


         for (Employee employee:employeeList1){
             if(!employeeList.isEmpty()){
                 System.out.println(employee.toString());
             }
         }






    }

    public static double getAverageSalary(List<Employee>employees) {
        double sum=0;
        for (Employee employee:employees) {
            sum=sum+employee.getSalary();
        }
        return sum / employees.size();
    }
}
