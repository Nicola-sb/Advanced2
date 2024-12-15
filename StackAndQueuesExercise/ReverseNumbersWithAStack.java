package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String>printStackNumbers=new ArrayDeque<>();
        String[]numbers=(scanner.nextLine().split(" "));
        //Начин за пълнене на стека с метода addAll --> трябва да го превърнем първо в Лист
//        printStackNumbers.addAll(List.of(numbers));


        for (String elemenet:numbers){
            printStackNumbers.push(elemenet);
        }

        for (String element:printStackNumbers){
            System.out.print(printStackNumbers.pop()+ " ");
        }

//        while (!printStackNumbers.isEmpty()){
//            System.out.print(printStackNumbers.pop()+ " ");
//        }

    }
    }
