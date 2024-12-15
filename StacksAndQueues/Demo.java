package StacksAndQueues;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> sum=new ArrayDeque<>();

        String[] inputToSum=(scanner.nextLine().split("\\s+"));//2 + 5 + 10 - 2 - 1

        for (String element:inputToSum){
            sum.push(element);
        }
        Collections.reverse(Arrays.asList(sum));

        while (sum.size()>1){
            int firstNum=Integer.valueOf(sum.pop());
            String operator=sum.pop();
            int secondNum=Integer.valueOf(sum.pop());

            switch (operator){
                case "+":
                    sum.push(String.valueOf(firstNum+secondNum));
                    break;
                case "-":
                    sum.push(String.valueOf(firstNum-secondNum));
                    break;
            }
        }
        System.out.println(sum.pop());
    }
}
