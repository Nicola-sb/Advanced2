package IteratorsAndComparatorsExercise.StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<Person>personNameSet=new TreeSet<>(new ComparatorNamesLenght());
        TreeSet<Person>ageSet=new TreeSet<>(new ComparatorByAge());

        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1 ;i<=n ;i++){
            String[]input=scanner.nextLine().split("\\s+");
            String name=input[0];
            int age=Integer.parseInt(input[1]);

            Person person=new Person(name,age);
            personNameSet.add(person);
            ageSet.add(person);
        }

        for (Person personName:personNameSet){
            System.out.println(personName);
        }

        for (Person agePerson:ageSet){
            System.out.println(agePerson);
        }

    }
}
