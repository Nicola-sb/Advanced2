package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        String [] numbers=scanner.nextLine().split("\\s+");//5 2 13
        //On the first line, you will be given N, S, and X separated by a single space.
        int n= scanner.nextInt();//брой на елементите,който трябва да добавя в стека
        int s= scanner.nextInt();
        int x=scanner.nextInt();

        //On the next line, you will be given a line of numbers separated by one or more white spaces
        String[]checkNumber=scanner.nextLine().split("\\s+");// 1 13 45 32 4

        ArrayDeque<Integer>numberToCheck=new ArrayDeque<>();

        //добавяне n на брой пъти

       for(int i=1 ;i<=n ;i++){
           numberToCheck.push(scanner.nextInt());
       }

       for(int i=1 ;i<=s ;i++){
           numberToCheck.pop();
       }

       if(numberToCheck.contains(x)){
           System.out.println("true");
       }else{
           if(numberToCheck.isEmpty()){
               System.out.println(0);
           }else{
               System.out.println(Collections.min(numberToCheck));
           }
       }
       //Какво научих от задачата?
        //Collection.min --> това ми дава най-малкото число то дадена колекция(в случая стека)
        //със scanner.nextInt си прочитам следващто цяло число от конзолата


    }
}
