package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal=Integer.parseInt(scanner.nextLine());//10 -->1010

        ArrayDeque<Integer>printDecimal=new ArrayDeque<>();

        if(decimal==0){
            System.out.println(0);
        }else{
            while (decimal!=0){
                int leftNum=decimal%2;
                printDecimal.push(leftNum);
                decimal=decimal/2;
            }
        }

        for (int element:printDecimal){
            System.out.print(element);
        }
        
    }
}
