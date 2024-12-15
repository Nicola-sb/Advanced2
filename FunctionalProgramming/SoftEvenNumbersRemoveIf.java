package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftEvenNumbersRemoveIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]numbers=scanner.nextLine().split(",\\s+");

        List<Integer> printNumbers= Arrays.stream(numbers)
                .map(e->Integer.parseInt(e)).collect(Collectors.toList());

        printNumbers.removeIf(e -> e % 2!=0);

        List<String>printNumbers2=printNumbers.stream().map(e -> e.toString()).collect(Collectors.toList());
        System.out.println(String.join(", ",printNumbers2));

        printNumbers.sort((left,right)->left.compareTo(right));
        List<String>printNumbers3=printNumbers.stream().map(e-> e.toString()).collect(Collectors.toList());
        System.out.println(String.join(", ",printNumbers3));

    }
}
