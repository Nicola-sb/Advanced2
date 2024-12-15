package IteratorsAndComparatorsExercise.ComparingObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //On single lines, you will be given people in the format:
        //"{name} {age} {town}"
        //Collect them till you receive "END".
        //After that, you will receive an integer N - the Nth person in your collection.
        String input=scanner.nextLine();
        int allCountPeople=0;
        List<Person>myPersonList=new ArrayList<>();
        while (!input.equals("END")){
            ////"{name} {age} {town}"
            String name=input.split("\\s+")[0];
            int age=Integer.parseInt(input.split("\\s+")[1]);
            String town=input.split("\\s+")[2];
            Person person=new Person(name,age,town);

            myPersonList.add(person);
            allCountPeople++;

            input=scanner.nextLine();
        }
        int n=Integer.parseInt(scanner.nextLine());
        int count=0;
       //On the single output line, you should bring statistics, how many people are equal to him,
        // how many people are not equal to him, and the total people in your collection.
        //Format:
        //•	"{number of equal people} {number of not equal people} {total number of people}"
        //If there are no equal people print: "No matches".
        Person searchPerson=myPersonList.get(n-1);
        myPersonList.remove(searchPerson);

        for (Person person:myPersonList){
            if(searchPerson.compareTo(person)==0){
                count++;
            }
        }

        if(count==0){
            System.out.println("No matches");
        }else{
            //•	"{number of equal people} {number of not equal people} {total number of people}"
            System.out.printf("%d %d %d",count+1,allCountPeople-(count+1),allCountPeople);
        }
    }
}
