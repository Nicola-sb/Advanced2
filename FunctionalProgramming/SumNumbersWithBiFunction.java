package FunctionalProgramming;

import java.util.Scanner;
import java.util.function.BiFunction;

public class SumNumbersWithBiFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]numbers=scanner.nextLine().split(",\\s+");

        BiFunction<Integer,String,Integer>myBiFunction=(x,y)-> x+Integer.parseInt(y);

        int sum=0;

        for(int i=0 ;i<numbers.length ;i++){
            sum=myBiFunction.apply(sum,numbers[i]);
        }

        System.out.println("Count = "+numbers.length);
        System.out.println("Sum = "+sum);
    }
}
