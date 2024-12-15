package ExamPrepation;

import java.util.ArrayDeque;
import java.util.Scanner;

public class LootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLootBox=scanner.nextLine();
        String secondLootBox=scanner.nextLine();
        //10 11 8 13 5 6
        // 0 4 7 3 6 23 3


        String []firstLootBoxArray=firstLootBox.split("\\s+");
        ArrayDeque<Integer>firstLootBoxDeque=new ArrayDeque<>();
        for (String element:firstLootBoxArray){
            firstLootBoxDeque.add(Integer.parseInt(element));
        }
        String []secondLootBoxArray=secondLootBox.split("\\s+");
        ArrayDeque<Integer>secondLootBoxStack=new ArrayDeque<>();
        for (String element:secondLootBoxArray){
            secondLootBoxStack.push(Integer.parseInt(element));
        }
        int lootBoxSum=0;

        //You need to start from the first item in the first box and sum it up with the last item in the second box.
        // If the sum of their values is an even number, add the summed item to your collection of claimed items and remove them both from the boxes.
        // Otherwise, remove the last item from the second box and add it to the last position in the first box.
        // You need to stop summing items when one of the boxes becomes empty.
        while (!firstLootBoxDeque.isEmpty()&&!secondLootBoxStack.isEmpty()){
            int firstNum=firstLootBoxDeque.peek();
            int secondNum=secondLootBoxStack.peek();

            int sum=firstNum+secondNum;
            if(sum%2==0){
                firstLootBoxDeque.remove();
                secondLootBoxStack.pop();
                lootBoxSum+=sum;
            }else{
                secondLootBoxStack.pop();
                firstLootBoxDeque.add(secondNum);
            }
        }


        if(firstLootBoxDeque.isEmpty()){
            System.out.println("First lootbox is empty");
        }else{
            System.out.println("Second lootbox is empty");
        }

        if(lootBoxSum>=100){
            System.out.printf("Your loot was epic! Value: %d",lootBoxSum);
        }else{
            System.out.printf("Your loot was poor... Value: %d",lootBoxSum);
        }

    }
}
