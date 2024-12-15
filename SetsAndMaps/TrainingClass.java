package SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TrainingClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer>studentsGrade=new LinkedHashMap<>();

        studentsGrade.put("Nicola",6);
        studentsGrade.put("Krisi", 6);
        studentsGrade.put("Aleks" ,3);
        studentsGrade.put("Georgi",3);
        studentsGrade.put("Tosho",4);

//        studentsGrade.values().stream().forEach(System.out::println);
//        System.out.println("****");
//        studentsGrade.keySet().stream().forEach(System.out::println);
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        studentsGrade.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+ " "+ entry.getValue()));
//        System.out.println();
        studentsGrade.entrySet().stream().sorted((left,right)-> {return left.getValue().compareTo(right.getValue());})
                .forEach(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));

        System.out.println();

        studentsGrade.entrySet().stream().sorted((left,right)->
        {return right.getValue().compareTo(left.getValue());})
                .forEach(entry -> System.out.println(entry.getKey()+" "+entry.getValue()));

        System.out.println();

        studentsGrade.entrySet().stream().sorted((left,right)->{
            return right.getKey().compareTo(left.getKey());
        }).forEach(entry -> System.out.println(entry.getKey()+" "+ entry.getValue()));

    }
}
