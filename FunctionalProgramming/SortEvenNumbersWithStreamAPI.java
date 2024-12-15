package FunctionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class SortEvenNumbersWithStreamAPI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]numbers=scanner.nextLine().split(",\\s+");
        //4, 2, 1, 3, 5, 7, 1, 4, 2, 12

        List<String> printListNumbers= Arrays.stream(numbers)
                .map(e -> Integer.parseInt(e))
                .filter(e-> e%2==0)
                .map(e -> e.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ",printListNumbers));

        printListNumbers=printListNumbers.stream()
                .map(e -> Integer.parseInt(e))
                .sorted()
                .map(e -> e.toString())
                .collect(Collectors.toList());

        System.out.println(String.join(", ",printListNumbers));


    }
}
