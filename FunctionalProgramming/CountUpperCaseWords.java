package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUpperCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Write a program that reads one line of text from the console.
        // Print the count of words that start with an Uppercase letter, after that print all these words in the same order, as you found them in the text.
        //Use a Predicate<String>.

        String[]textInput=scanner.nextLine().split("\\s+");

        Predicate<String> myPredicate= word -> Character.isUpperCase(word.charAt(0));
        List<String> myList= Arrays.stream(textInput).filter(myPredicate).collect(Collectors.toList());
        System.out.println(myList.size());
        Arrays.stream(textInput).filter(myPredicate).forEach(name -> System.out.println(name));

    }
}
