package ExamPrepation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer>roses=new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(",\\s+")).map(Integer::parseInt).forEach(roses::push);

        ArrayDeque<Integer>lilies=Arrays.stream(scanner.nextLine().split(",\\s+")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        //10, 15, 2, 7, 9, 13
        //2, 10, 8, 12, 0, 5
        int countBoquets=0;
        int storeSum=0;

        while (!roses.isEmpty()&&!lilies.isEmpty()){
            int firstElelement=roses.peek();
            int secondElement=lilies.peek();

            int sum=firstElelement+secondElement;
            //If the sum of their values is equal to 15 – create one wreath and remove them.
            // If the sum is bigger than 15, just decrease the value of the lilies by 2.
            // If the sum is less than 15 you have to store them for later and remove them

            if(sum==15){
                countBoquets++;
                roses.pop();
                lilies.poll();
            }else if(sum > 15){
                int valuesLilies=lilies.peek()-2;
                lilies.poll();
                lilies.push(valuesLilies);
            }else{
                storeSum+=sum;
                roses.pop();
                lilies.poll();
            }
        }

        int storedFlowers=storeSum/15;
        int allStoredFlower=storedFlowers+countBoquets;

        if(countBoquets>=5){
            System.out.printf("You made it, you are going to the competition with %d wreaths!",allStoredFlower);
        }else{
            System.out.printf("You didn't make it, you need %d wreaths more!",5-allStoredFlower);
        }



    }
}
