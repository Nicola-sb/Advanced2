package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class FindTheSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
      //1ви начин
        //лист -> върна елемента на най-малкия индекс

//        Function<List<Integer>,Integer>myFunction=list -> list.lastIndexOf(Collections.min(numbers));
//
//        System.out.println(myFunction.apply(numbers));
        //Отпечай ми като ми проложиш функцията от myFunction върху листа numbers

        //2ри начин :  лист-> отпечатваме индекса на най-малкия елемент
        Consumer<List<Integer>>myConsumer=list -> System.out.println(list.lastIndexOf(Collections.min(numbers)));
        myConsumer.accept(numbers);



    }
}
