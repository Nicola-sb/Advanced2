package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String []numbers=scanner.nextLine().split(",\\s+");
       //4, 2, 1, 3, 5, 7, 1, 4, 2, 12
        int[]numbersInt=new int[numbers.length];


        for(int i=0 ;i<numbers.length ;i++){
            numbersInt[i]=Integer.parseInt(numbers[i]);
        }

        List<Integer> evenNumebrs=new ArrayList<>();

        for(int i=0 ;i<numbersInt.length ;i++){
            int currentElement=numbersInt[i];
            if(currentElement%2==0){
                evenNumebrs.add(currentElement);
            }
        }

        List<String>evenNumberString=new ArrayList<>();
        for(int i=0 ;i<evenNumebrs.size() ;i++){
//            evenNumberString.add(evenNumebrs.get(i).toString());
            evenNumberString.add(String.valueOf(evenNumebrs.get(i)));
        }

        System.out.println(String.join(", ",evenNumberString));

    }
}
