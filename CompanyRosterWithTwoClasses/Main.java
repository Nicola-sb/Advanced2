package CompanyRosterWithTwoClasses;

import CompanyRoster.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());
        Map<String,Department>departmentMap=new HashMap<>();
        for(int i=1 ;i<=n ;i++){
            String[]companyData=scanner.nextLine().split("\\s+");
            String name=companyData[0];
            double salary=Double.parseDouble(companyData[1]);
            String position=companyData[2];
            String department=companyData[3];
            Employee employee=null;

            if(companyData.length==6){
                String email=companyData[4];
                int age =Integer.parseInt(companyData[5]);
                employee=new Employee(name,salary,position,department,email,age);
            }else if(companyData.length==4){
                employee=new Employee(name,salary,position,department);
            }else if(companyData.length==5){
                String fiveOption=companyData[4];
                if(fiveOption.contains("@")){
                    String email=fiveOption;
                    employee=new Employee(name,salary,position,department,email);
                }else{
                    int age=Integer.parseInt(fiveOption);
                    employee=new Employee(name,salary,position,department,age);
                }
            }


              if(!departmentMap.containsKey(department)){
                  departmentMap.put(department,new Department(department));
              }
//              departmentMap.get(department).getEmployees().add(employee);
        }

        Department maxAverageSalaryDepartment = departmentMap.entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry -> entry.getValue().getAverageSalary()))
                .get()
                .getValue();

        System.out.println("Highest Average Salary: " + maxAverageSalaryDepartment.getName());
        maxAverageSalaryDepartment.getEmployees()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(employee -> System.out.println(employee.toString()));
    }
}
