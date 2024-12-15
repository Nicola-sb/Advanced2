package FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightOfHonour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String []inputNames=scanner.nextLine().split("\\s+");

//        Consumer<String[]>printNames=array -> {
//            for (String name:array){
//                System.out.print("Sir "+name);
//                System.out.println();
//            }
//        };
//        printNames.accept(inputNames);
        Consumer<String>printNames=name -> System.out.println("Sir "+name);

        Arrays.stream(inputNames).forEach(printNames);
        //Пускам си стрийм по масива с имената и му давам forEach и вътре му задавам Consumera


//        Arrays.stream(inputNames).forEach(name -> System.out.println("Sir "+name));
//        Function<String,String>myFunction=name -> "Sir "+name;


    }
}
