package SetsAndMapsExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String []input=scanner.nextLine().split("\\s+");
        int firstNum=Integer.parseInt(input[0]);//4
        int secondNum=Integer.parseInt(input[1]);//3

        Set<Integer> firstSet=new LinkedHashSet<>();
        Set<Integer> secondSet=new LinkedHashSet<>();

        Set<Integer>uniqueNumber=new LinkedHashSet<>();

        for(int i=1 ;i<=firstNum ;i++){
            int currentNumber=Integer.parseInt(scanner.nextLine());
            firstSet.add(currentNumber);
        }

        for(int i=1 ;i<=secondNum ;i++){
            int currentNum=Integer.parseInt(scanner.nextLine());
            secondSet.add(currentNum);
        }

//        for (int element:firstSet){
//            if(secondSet.contains(element)){
//                uniqueNumber.add(element);
//            }
//        }
//
//        uniqueNumber.forEach(element -> System.out.print(element+ " "));

        firstSet.retainAll(secondSet);

        firstSet.forEach(element-> System.out.print(element+" "));


    }
}
