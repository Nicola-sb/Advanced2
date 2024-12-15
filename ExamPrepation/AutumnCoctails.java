package ExamPrepation;

import java.util.*;
import java.util.stream.Collectors;

public class AutumnCoctails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer>numberOfIngreditients= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer>freshness=new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).forEach(freshness::push);
        //10 10 12 8 10 12
        //25 15 50 25 25 15
        Map<String,Integer> finalPrint=new TreeMap<>();
        finalPrint.put("Pear Sour",0);
        finalPrint.put("The Harvest",0);
        finalPrint.put("Apple Hinny",0);
        finalPrint.put("High Fashion",0);

        int peerSour=0;
        int theHarvest=0;
        int appleHunny=0;
        int highFashinon=0;
        int sumIncreditient=0;

        while (!numberOfIngreditients.isEmpty() && !freshness.isEmpty()){
            int firstIncreditients=numberOfIngreditients.peek();
            int secondFreshnessValue=freshness.peek();
            //In case you have an ingredient with a value of 0 you have to remove it and continue mixing the cocktails.
            if(firstIncreditients==0){
                numberOfIngreditients.poll();
                continue;
            }
            int sum=firstIncreditients*secondFreshnessValue;

            //If the product of this operation equals one of the levels described in the table,
            // you make the cocktail and remove both buckets with ingredients and freshness value.
            if(sum==150){
                Integer currentValie=finalPrint.get("Pear Sour")+1;
                finalPrint.put("Pear Sour",currentValie);
                peerSour++;
                numberOfIngreditients.poll();
                freshness.pop();
            }else if(sum==250){
                Integer currentValue=finalPrint.get("The Harvest")+1;
                finalPrint.put("The Harvest",currentValue);
                theHarvest++;
                numberOfIngreditients.poll();
                freshness.pop();
            }else if(sum==300){
                Integer currentValue=finalPrint.get("Apple Hinny")+1;
                finalPrint.put("Apple Hinny",currentValue);
                appleHunny++;
                numberOfIngreditients.poll();
                freshness.pop();
            }else if(sum==400){
                Integer currentValue=finalPrint.get("High Fashion")+1;
                finalPrint.put("High Fashion",currentValue);
                highFashinon++;
                numberOfIngreditients.poll();
                freshness.pop();
            }else{
         // Otherwise, you should remove the freshness level, increase the ingredient value by 5, then remove it from the first position and add it at the end.
                sumIncreditient+=sum;
                freshness.pop();
                int increaseIngedientby5=firstIncreditients+5;
                numberOfIngreditients.poll();
                numberOfIngreditients.add(increaseIngedientby5);
            }
        }


        if(peerSour!=0 && theHarvest!=0 && appleHunny!=0 && highFashinon!=0){
            System.out.printf("It's party time! The cocktails are ready!%n");
//            System.out.printf("# Apple Hinny --> %d%n",appleHunny);
//            System.out.printf("# High Fashion --> %d%n",highFashinon);
//            System.out.printf("# Pear Sour --> %d%n",peerSour);
//            System.out.printf("# The Harvest --> %d%n",theHarvest);
            finalPrint.entrySet().forEach(entry ->
                    System.out.println(" # "+entry.getKey()+ " --> "+entry.getValue()));
        }else{
            System.out.printf("What a pity! You didn't manage to prepare all cocktails.%n");
            int sum=0;
            for (int element:numberOfIngreditients){
                sum+=element;
            }
            if(sum!=0){
                System.out.printf("Ingredients left: %d%n",sum);
            }
            finalPrint.entrySet().forEach(entry->
            {
                if(entry.getValue()!=0){
                    System.out.println(" # "+entry.getKey()+ " --> "+entry.getValue());
                }
            });


        }
    }
}
