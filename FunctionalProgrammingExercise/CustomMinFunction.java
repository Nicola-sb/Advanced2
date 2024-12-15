package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //1 4 3 2 1 7 13

        //1ви начин с Function
        Function<List<Integer>,Integer>myFunction= list -> Collections.min(inputNumbers);

//        System.out.println(Collections.min(inputNumbers));
//        System.out.println(myFunction.apply(inputNumbers));

        //2ри начин с Consumer
        Consumer<List<Integer>>myConsumer=list -> System.out.println(Collections.min(list));
        myConsumer.accept(inputNumbers);
        //Извиквам си Consumer и към него искам да ми се приложи списъка от листа с inputNumbers

    }
}
