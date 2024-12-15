package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedAritmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myNumbers= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        //1 2 3 4 5
        Function<List<Integer>,List<Integer>>addList=list -> list.stream().map(element -> element +1).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>>multiplyList=list -> list.stream().map(element -> element * 2).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>>subtractList=list -> list.stream().map(element -> element-1).collect(Collectors.toList());
        Consumer<List<Integer>>print=list -> list.forEach(element -> System.out.print(element+ " "));

        String command=scanner.nextLine();
        while (!command.equals("end")){
            //add" -> adds 1; "multiply" -> multiplies by 2; "subtract" -> subtracts 1; "print" -> prints all numbers on a new line
            switch (command){
                case "add":
                myNumbers=addList.apply(myNumbers);
                    break;
                case "subtract":
                    myNumbers=subtractList.apply(myNumbers);
                    break;
                case "multiply":
                    myNumbers=multiplyList.apply(myNumbers);
                    break;
                case "print":
                    print.accept(myNumbers);
                    System.out.println();
                    break;
            }
            command=scanner.nextLine();
        }

    }
}
