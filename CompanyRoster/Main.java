package CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Your task is to write a program that takes N lines of information about employees from the console
        // and calculates the department with the highest average salary and prints for each employee in that department his
        // name, salary, email, and age - sorted by salary in descending order

        int n=Integer.parseInt(scanner.nextLine());
        Map<String, List<Employee>>departmentsMap=new HashMap<>();
        for(int i=0 ;i<n ;i++){
          String[]companysData=scanner.nextLine().split("\\s+");
          //Peter 120.00 Dev Development peter@abv.bg 28
            String name=companysData[0];
            double salary=Double.parseDouble(companysData[1]);
            String positon=companysData[2];
            String departament=companysData[3];
            Employee employee=null;//null e защото ще си създам обекта(employee) след като разбера колко параметъра има:Дали са 4,5 или 6 Накрая го създавам

            if(companysData.length==6){
                String email=companysData[4];
                int age=Integer.parseInt(companysData[5]);
                employee=new Employee(name,salary,positon,departament,email,age);

            }else if(companysData.length==4){
                //Ако параметрите са ми 4 си създавам нов обект(employye) с конструктора,който съм си направил в класа Employee с 4 характеристики(name,salary,position,departament)
                employee=new Employee(name,salary,positon,departament);

            }else if(companysData.length==5){
                //Ако дължината ми е 5 имам два варианта:5я паратаметър да ми бъде или email Или age
                //За това си създавм променлива в коята да държа 5я параметър
                String forthParametar=companysData[4];//email or age
                //Правя си проверка дали е имейл или вързраст.С проверката contains ,ако съдържа @ значи е имейл
                if(forthParametar.contains("@")){
                    String email=forthParametar;
                    employee=new Employee(name,salary,positon,departament,email);
                }else{
                    int age=Integer.parseInt(forthParametar);
                    employee=new Employee(name,salary,positon,departament,age);
                }
            }
            //Имам си обекта employee//служител на който знам отдела

            //Трябва да знаем във всеки един отдел какви хора имаме  -> най-удобно ще бъде с мап в който ще си държим
            //В Стринга ще си държим името на отдела,а в List<Employee> ше ни бъде списъка със слъжителите

            //Трябва да проверя дали отделът на този служетел го има
            //1.Отделът на служетеля да го няма
            if(!departmentsMap.containsKey(departament)){//Това значи,че моят отдел го няма
                //Ако го няма аз искам да си го сложа/добавя
                departmentsMap.put(departament,new ArrayList<>());//В мапа си добавям отделът с нов празен лист;
                //отдел-> празен лист/списък
                //След това трябва да кажа,че в празния списък трябва да си сложа employee
                departmentsMap.get(departament).add(employee);//Искам да си взема листа,който ми стой срещу ключа department и вътре в листа да си добавя employee

            }else{
                //2.Отделът на служтеля да го има
                //Ако отделът го има искам към списъка на този отдел да си добавя служителя(employee);Взимам си отделът с get. и към неговия лист си добавям employee
                //От мапа си взимам списъка,който ми стои срещу този отдел и към този списък искам да си добавя служителя(employee)
                departmentsMap.get(departament).add(employee);

            }
        }

        //Вече си имаме в мапа Отдел,<Списък със служителите>
        //Трябва да намерим кой е отделът с най-голяма средна заплата?

        //Как от мапа ще намеря кой е отделът с най-висока средна заплата???
        String maxAverageSalaryDepartment=departmentsMap.entrySet()//Взимам си мапа с всичките негови записи и по него пускам stream
                .stream()//На стрийма мога да му дам max,но вътре трябва да задам по какъв начин да сравяняваме стойностите(Трябва да кажем по какъв параметър да ги сравняваме)
                .max(Comparator.comparingDouble(entry -> getAvaragesalaray(entry.getValue())))//Създаваме си Компаратор,който ще сравнява по дробни числа .Трябва от списъка ни със служители да получава ср. заплата на всеки отдел
                .get()//S get wzimam entryto ----  entry (отдел-> списък със служители)
                .getKey();
        //Искам всеки път да ми се сравянява записа(entry) -> като на този запис трябва да взема стойсота(Списъка със служителите/Lista s Employee
        //От списъка със служтелите трябва да получавам double число,което ми е срдната заплата;Ще си направя метод,който ми връща дробно число със средната заплата
        //Метод ще приема списък със служтели и в съотвения отдел ще намира ср заплата
        System.out.printf("Highest Average Salary: %s%n",maxAverageSalaryDepartment);

        //Трябва ни списъка с хората от отдела с най-висока заплата
        //Създвам си едн List<Employees> в който ще държа хората с най-висока заплата
        //Как да взема хората с най-висока заплата?
        List<Employee>employeeList=departmentsMap.get(maxAverageSalaryDepartment);//Взимам си мапа и от него си достъпвам отделът с най-висока заплата(maxAverageSalaratyDeparment)
        //Трябва да си принтирам служители в листа по discending order
        employeeList.sort(Comparator.comparingDouble(employee-> employee.getSalary()));//Всяка едно employee ми го сравнява като взима неговата заплата
        Collections.reverse(employeeList);

        //Трябва да отпечатаме всеки един от служителите
        for (Employee employee:employeeList){
            System.out.println(employee);//За да отпечаме служителя ще ни трябва метод toString
        }

    }

    public static double getAvaragesalaray(List<Employee> employees) {
        //Метод ще приема списък със служтели и в този списък със служители в съотвения отдел да намираме ср заплата
        //За да намерим ср заплата ни трябва сумата от заплатата.Създавма си променлива sum
        //Сумата от заплата трябва да я разделя на броя на служителите за да си намеря средната заплата
        double sum=0;
        //За да си намеря ср. заплата с forEach ще обходя всеки един служитет от списъка със служители
        for (Employee employee:employees){
            //На всеки един от служителите искам да взема заплата и да я добавя към сумата
            sum+=employee.getSalary();//Трябва да си създам гетър в класа Employee
        }
        return sum/employees.size();
    }


}
