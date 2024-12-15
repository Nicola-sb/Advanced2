package FunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class TrainingClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Write a program that reads an integer N on the first line. And on next N lines read pairs of "{name}, {age}". Then read three more lines with:
        //•	Condition - "younger" or "older"
        //•	Age - Integer
        //•	Format - "name", "age" or "name age"
        //Depending on the condition, print the pairs in the right format.

        //5
        //Peter, 20
        //George, 18
        //Maria, 29
        //Idan, 31
        //Simeon, 16
        //older
        //20
        //name age
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,Integer>mapToPrint=new LinkedHashMap<>();
        for(int i=0 ;i<n ;i++){
            String[]inputdata=scanner.nextLine().split(", ");
            String name=inputdata[0];
            String age=inputdata[1];

            mapToPrint.put(name,Integer.parseInt(age));
        }
        String condition=scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());
        String format=scanner.nextLine();

        BiPredicate<Integer,Integer>filterPredicate;
        if(condition.equals("younger")){
            filterPredicate=(agePerson,age1) -> agePerson<=age1;
        }else{
            filterPredicate=(agePerson,age1) -> agePerson>=age1;
        }


        Consumer<Map.Entry<String,Integer>>printConsuer;
        if(format.equals("age")){
            printConsuer= person -> System.out.println(person.getValue());
        }else if(format.equals("name")){
            printConsuer=person -> System.out.println(person.getKey());
        }else{
            printConsuer= person -> System.out.printf("%s - %d%n",person.getKey(),person.getValue());
        }

        mapToPrint.entrySet().stream().filter(person ->filterPredicate.test(person.getValue(), age)).forEach(printConsuer);

    }
}
