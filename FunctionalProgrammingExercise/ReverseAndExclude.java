package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numbers= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //1 2 3 4 5 6
        //2
        int n=Integer.parseInt(scanner.nextLine());
        Collections.reverse(numbers);
        //{6,5,4,3,2,1}

        //remove all numbers which are divisible on n
        //Примена число -> true/false

//        Predicate<Integer>myPredicate= element -> element%n!=0;
//        //Създавм си предикат с цяло число -> ще получам true ако числото ми се дели на n / и false ако не се дели
//        numbers=numbers.stream().filter(myPredicate).collect(Collectors.toList());
//        numbers.forEach(element-> System.out.print(element+ " "));

        Predicate<Integer>myPredicate=element-> element % n ==0;
        numbers.removeIf(myPredicate);
        numbers.forEach(element -> System.out.print(element + " "));
    }
}
