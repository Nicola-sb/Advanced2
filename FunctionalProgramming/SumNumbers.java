package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]numbers=scanner.nextLine().split(",\\s+");
        //4, 2, 1, 3, 5, 7, 1, 4, 2, 12

        //1во трябва да си превърна масиво numbers от стрингов към интове за да мога да намеря общата сума
        Function<String,Integer>parser = e -> Integer.parseInt(e);
       List<Integer> intNumbers= Arrays.stream(numbers).map(parser).collect(Collectors.toList());
       //Първо използваме .map за да можем да си го превърнем в списък

       int sum=Arrays.stream(numbers).mapToInt(e->Integer.parseInt(e)).sum();
       //Второ използваме .mapToInt за да можем да си вземем сумата

        System.out.println("Count = "+ intNumbers.size());
        System.out.println("Sum = "+sum);


    }
}
