package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParenthesesStackAndQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textToFind=scanner.nextLine();//( { [

        ArrayDeque<Character> openBracketsStack=new ArrayDeque<>();
        ArrayDeque<Character> closeBracketsQueue=new ArrayDeque<>();


        for(int i=0 ;i<textToFind.length() ;i++){
            char currentSymbol=textToFind.charAt(i);

            if(currentSymbol=='('|| currentSymbol=='['|| currentSymbol=='{'){
                openBracketsStack.push(currentSymbol);
            }else if(currentSymbol ==')'||currentSymbol==']'||currentSymbol=='}') {
                closeBracketsQueue.offer(currentSymbol);
            }
        }

        boolean areTheSame=false;

        if(openBracketsStack.size()!=closeBracketsQueue.size()){
            System.out.println("NO");
        }else{
            while (!openBracketsStack.isEmpty() && !closeBracketsQueue.isEmpty()){
                char firstOpen=openBracketsStack.pop();
                char firsClose=closeBracketsQueue.poll();

                if(firstOpen=='('&& firsClose==')'){
                    areTheSame=true;
                }else if(firstOpen=='['&& firsClose==']'){
                    areTheSame=true;
                }else if(firstOpen=='{'&& firsClose=='}'){
                    areTheSame=true;
                }else {
                    areTheSame=false;
                    break;
                }
            }
            if(areTheSame){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }


        //Какво научих от задачата?
        //Преди да вземем нещо от даден стек brackets.pop --> Първо да проверим дали стека не е празен!!!

    }
}
