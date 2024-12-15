package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         String textToFind=scanner.nextLine();//( { [

        ArrayDeque<Character>brackets=new ArrayDeque<>();

        boolean areTheSame=false;

        for(int i=0 ;i<textToFind.length() ;i++){
            char currentSymbol=textToFind.charAt(i);

            if(currentSymbol=='('|| currentSymbol=='['|| currentSymbol=='{'){
                brackets.push(currentSymbol);
            }else if(currentSymbol ==')'||currentSymbol==']'||currentSymbol=='}'){
                if(brackets.isEmpty()){
                    areTheSame=false;
                break;
                }else{
                    char lastSymbol = brackets.pop();//(

                    if(currentSymbol==')'&& lastSymbol=='('){
                        areTheSame=true;
                    }else if(currentSymbol==']'&& lastSymbol=='['){
                        areTheSame=true;
                    }else if(currentSymbol=='}'&& lastSymbol=='{'){
                        areTheSame=true;
                    }else{
                        areTheSame=false;
                        break;
                    }
                }
            }
        }

        if(areTheSame){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        //Какво научих от задачата?
        //Преди да вземем нещо от даден стек brackets.pop --> Първо да проверим дали стека не е празен!!!

    }
}
