package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[]numbers= Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
        //Write a custom comparator that sorts all even numbers before all odd ones in ascending order.
        // Pass it to an Arrays.sort() function and print the result
        // input -> 1 2 3 4 5 6
        //output -> -3 2
        Comparator<Integer>comparator=(first,second) ->{
            if(first%2==0 && second % 2!=0){
                return -1;
                //първото е четно
                //второто е нечетно
            }else if(first % 2!=0 && second % 2 == 0){
                return 1;
                //първото е нечетно
                //второто е четно
            }
            //и двете са четни
            //и двете са нечетни

            return first.compareTo(second);
        };

        Arrays.sort(numbers,comparator);

        Arrays.stream(numbers).forEach(element -> System.out.print(element+ " "));


    }
}
