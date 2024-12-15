package IteratorsAndComparatorsExercise.FroggyAlone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer [] numbers= Arrays.stream(scanner.nextLine().split(",\\s+")).map(Integer::parseInt).toArray(Integer[]::new);

        Lake lake=new Lake(numbers);

        List<String> numbersList=new ArrayList<>();

        for (Integer currentNumber:lake){
            numbersList.add(String.valueOf(currentNumber));
        }

        System.out.println(String.join(", ",numbersList));



    }
}
