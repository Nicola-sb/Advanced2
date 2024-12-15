package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FindEvenOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]numbers=scanner.nextLine().split(" ");
        int firstNum=Integer.parseInt(numbers[0]);
        int lastNum=Integer.parseInt(numbers[1]);
        String everOrOdd=scanner.nextLine();

        Predicate<Integer>printerPredicate;
        Consumer<Integer>printTheNumber ;

        for(int i=firstNum ;i<lastNum ;i++){
            if(everOrOdd.equals("even")){
//                printerPredicate.test(i);
                printTheNumber=e -> System.out.printf("e ");
            }else{
                printerPredicate=e -> e%2!=0;
            }
        }


    }
}
