package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text=new StringBuilder();

        int n=Integer.parseInt(scanner.nextLine());

        ArrayDeque<String>stackToPrint=new ArrayDeque<>();

        for(int i=0 ;i<n ;i++){
            String[] commandParts=scanner.nextLine().split("\\s+");

            String command=commandParts[0];

            switch (command){//1 abc
                case "1":
                    //"1 {string}" - appends [string] to the end of the text.
                    stackToPrint.push(text.toString());
                    String string =commandParts[1];
                    text.append(string);
                    break;
                case "2":
                    //"2 {count}" - erases the last [count] elements from the text//abce 3
                    stackToPrint.push(text.toString());
                    int count=Integer.parseInt(commandParts[1]); //abcd
                    int startIndex=text.length() - count;
                    text.delete(startIndex,text.length());

                    break;
                case "3":
                    //3 {index}" - returns the element at position [index] from the text.
                    int currentIndex=Integer.parseInt(commandParts[1]);
                    System.out.println(text.charAt(currentIndex-1));
                    break;
                case "4":
                    //4" - undoes the last not-undone command of type 1 or 2 and returns the text to the state before that operation.
//                    if(!stackToPrint.isEmpty()){
//                        text=new StringBuilder(stackToPrint.pop());
//                    }
                    text=new StringBuilder(stackToPrint.pop());
                    break;
            }
        }
        //Kакво научих и какво трябва да запомня?
        //На последният ред при text--> запазвам си текста като си викна нов СБ и отдавам извикам последно добавнеият ми текст
        // на точка 3--> трябва да принитрам 3тата буква която ми е стои на индеска -1
        //на точка 2--> трябва да изтрия последните N на брой цифри...как става?
        //Съдавам си променлива в която си държа от къде трябва да започна да трия->> от дължоната на текста - N
        //На 3та токча за да си изпринтрам елемента го викам с  text.charAt
    }
}
