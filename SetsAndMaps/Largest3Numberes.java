package SetsAndMaps;

import java.util.Arrays;
import java.util.Scanner;

public class Largest3Numberes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .sorted((left,right) -> right.compareTo(left)).limit(3)
                .forEach(element -> System.out.printf("%d ",element));

    }
}
