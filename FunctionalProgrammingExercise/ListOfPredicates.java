package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        //Find all numbers in the range 1..N that is divisible by the numbers of a given sequence. Use predicates
        //отпечатваме числата от 1 до n ,които са делят едновременно на всички числа от списъка
        //число,списъка -> true (числото се дели на всички числа в списъка;  false (ако числото не се дели на всички числа в списъка)
        BiFunction<Integer,List<Integer>,Boolean> isDivisible=((number,list)->{
            for (int numberInList:list){
                if(number % numberInList!=0){
                    return false;
                }
            }
            return true;
        });

        //всички числа от 1 до n -> проверка дали се дели на всички числа в списъка -> print числото
        for(int i=1 ;i<=n ;i++){
            if(isDivisible.apply(i,numbers)){
                System.out.print(i+ " ");
            }
            //Когато приложа isDivisible,върхи това число(i) и тоси лист(numbers) ще получа true или false
            //Ако получа true си принтирам числото
        }
    }
}
