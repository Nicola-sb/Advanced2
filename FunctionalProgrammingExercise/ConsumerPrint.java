package FunctionalProgrammingExercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.начин
//        Consumer<String>names=name -> System.out.println(name);
//        List<String> namesList= Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
//        namesList.forEach(names);

        //2ри начин
        String[]inputNames=scanner.nextLine().split("\\s+");
//        Consumer<String>printName=name -> System.out.println(name);
//        for (String name:inputNames){
//            printName.accept(name);
//        }

        //3ти начин
        //Масив с имена->печатане
        Consumer<String[]>printName=array -> {
            for (String name:array){
                System.out.println(name);
            }
        };
        printName.accept(inputNames);
    }
}
