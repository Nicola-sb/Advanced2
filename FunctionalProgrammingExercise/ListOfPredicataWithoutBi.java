package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicataWithoutBi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<Integer>numbers= Arrays.stream(scanner.nextLine().split( "\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Predicate<Integer>myPredicate=numberElement ->{
            for (int numberToDivide:numbers){
                  if(numberElement%numberToDivide!=0){
                      return false;
                  }
            }
            return true;
        };

        for(int i=1 ;i<=n ;i++){
            if(myPredicate.test(i)){
                System.out.print(i + " ");
            }
        }
    }
}
