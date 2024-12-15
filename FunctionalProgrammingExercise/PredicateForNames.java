package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine()); //дължината за сравнение
        String []namesInput=scanner.nextLine().split("\\s+"); // списък с имената

        //Write a predicate. Its goal is to check a name for its length and to return true
        //Предиката ще приема име(Стринг) и искаме да върнем true,ако дължината на името е <=n
        Predicate<String>predicateName=name -> name.length() <=n;

        Arrays.stream(namesInput).filter(predicateName).forEach(name -> System.out.println(name));

    }
}
