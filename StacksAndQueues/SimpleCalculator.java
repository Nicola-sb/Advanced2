package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитане на Стек от конзолата--->
        String[] tokens=scanner.nextLine().split("\\s+");//2 + 5 + 10 - 2 - 1
        ArrayDeque<String> stack=new ArrayDeque<>();
        Collections.addAll(stack,tokens);

        while (stack.size()>1){
            int first=Integer.valueOf(stack.pop());
            String operator=stack.pop();
            int second=Integer.valueOf(stack.pop());

            switch (operator){
                case "+":
                    stack.push(String.valueOf(first+second));
                    break;
                case "-":
                    stack.push(String.valueOf(first-second));
                    break;
            }
        }
        System.out.println(stack.pop());
        //Как да попълня стека??? Правя си фориййч и го пускам по инпут
//        for (int element:input){
//            stack.push(element);
//        }
        //Напълних си Стека и го прочетох от конзолата



        
    }
}
