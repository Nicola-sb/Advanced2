package IteratorsAndComparatorsExercise.Froggy;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        Integer [] numbersInt= Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray(Integer[]new);
        Integer [] numbersArr= Arrays.stream(scanner.nextLine().split(",\\s+")).map(Integer::parseInt).toArray(Integer[]::new);

         Lake lake=new Lake(numbersArr);

        List<String>result=new ArrayList<>();

         for (Integer element:lake){
             result.add(String.valueOf(element));
         }

        System.out.println(String.join(", ",result));
    }
}
