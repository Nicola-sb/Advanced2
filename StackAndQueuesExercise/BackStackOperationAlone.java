package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BackStackOperationAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] numbers=scanner.nextLine().split("\\s+");//5 2 13
        //On the first line, you will be given N, S, and X separated by a single space
        int n=Integer.parseInt(numbers[0]);////брой на елементите,който трябва да добавя в стека
        int s=Integer.parseInt(numbers[1]);
        int x=Integer.parseInt(numbers[2]);

        //On the next line, you will be given a line of numbers separated by one or more white spaces.
        String[]element=scanner.nextLine().split("\\s+");

        ArrayDeque<Integer>printNumber=new ArrayDeque<>();//1 13 45 32 4
//        for (String elementForeach:element){
//            printNumber.push(Integer.parseInt(elementForeach));
//        }

        for(int i=0 ;i<n ;i++){
            printNumber.push(Integer.parseInt(element[i]));
        }

        for(int i=0 ;i<s ;i++){
            printNumber.pop();
        }

        if(printNumber.contains(x)){
            System.out.println("true");
        }else{
            if(printNumber.isEmpty()){
                System.out.println(0);
            }else{
                System.out.println(Collections.min(printNumber));
            }
        }




    }
}
