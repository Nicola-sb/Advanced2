package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Последната отворена трябва да съвпада с последната затворена

        String textToFind=scanner.nextLine();

        ArrayDeque<Integer> brackets=new ArrayDeque<>();

        for(int i=0 ;i<textToFind.length() ;i++){
            char current=textToFind.charAt(i);

            if(current=='('){
                brackets.push(i);//If you find an opening bracket, push the index into the stack.
            }else if(current==')'){
                int begin=brackets.pop();//If you find a closing bracket, pop the topmost element from the stack. This is the index of the opening bracket.
                System.out.println(textToFind.substring(begin,i+1));
            }
        }

    }
}
