package RegularExam;

import java.util.*;
import java.util.stream.Collectors;

public class ApocalypsePreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer>textile=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));
        //textile ми е опашката queue
        ArrayDeque<Integer>medicaments=new ArrayDeque<>();//Това ми е стека
        Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).forEach(medicaments::push);
        //20 10 40 70 20
        //50 10 30 20 80
        int patchCount=0;
        int bandageCount=0;
        int medKitCount=0;
        Map<String,Integer>printMap=new TreeMap<>();
        printMap.put("Patch",0);
        printMap.put("Bandage",0);
        printMap.put("MedKit",0);

        while (!textile.isEmpty() && !medicaments.isEmpty()){
            int firstElementTextile=textile.peek();
            int lastElementsMedicaments=medicaments.peek();


            int sum=firstElementTextile+lastElementsMedicaments;
            //•	if their sum is equal to any of the items in the table below create that item and remove both values.
            if(sum==30){
              patchCount++;
              int currentValue=printMap.get("Patch")+1;
              printMap.put("Patch",currentValue);
              textile.poll();
              medicaments.pop();
            }else if(sum==40){
                bandageCount++;
                int currentValue=printMap.get("Bandage")+1;
                printMap.put("Bandage",currentValue);
                textile.poll();
                medicaments.pop();
            }else if(sum==100){
                medKitCount++;
                int currentValue=printMap.get("MedKit")+1;
                printMap.put("MedKit",currentValue);
                textile.poll();
                medicaments.pop();
            }else if(sum>100){
                 //•	Otherwise, check if the sum is bigger than the value of the MedKit, create the MedKit,
                // remove both values, and add the remaining resources(of the sum) to the next value in the medicament collection
                // (Take the element from the collection, add the remaining sum to it, and put the element back to its place).
                medKitCount++;
                int currentValue=printMap.get("MedKit")+1;
                printMap.put("MedKit",currentValue);
                int remainngSum=sum-100;
                textile.poll();
                medicaments.pop();
                int nextMedicament=medicaments.peek();
                medicaments.pop();
                nextMedicament=nextMedicament+remainngSum;
                medicaments.push(nextMedicament);
            }else{
                //•	If you can’t create anything, remove the textile value, add 10 to the medicament value,
                // and return the medicament back to its place, into its collection
                textile.poll();
                int currentValue=lastElementsMedicaments+10;
                medicaments.pop();
                medicaments.push(currentValue);
            }
        }
        if(textile.isEmpty() && medicaments.isEmpty()){
            System.out.println("Textiles and medicaments are both empty.");
        }else if(textile.isEmpty()){
            System.out.println("Textiles are empty.");
        }else if(medicaments.isEmpty()){
            System.out.println("Medicaments are empty.");
        }

//        printMap.entrySet().forEach(entry -> {
//            if(entry.getValue()>0){
//                System.out.println(entry.getKey()+" - "+entry.getValue());
//            }
//        });
        printMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach( entry -> {
            if(entry.getValue()>0){
                System.out.println(entry.getKey()+" - "+entry.getValue());
            }
        });

//        printMap.entrySet().stream().sorted((e1,e2)->e2.getValue().compareTo(e1.getValue()))
//                        .forEach(entry -> {
//                            if(entry.getValue()>0){
//                                System.out.println(entry.getKey()+" - "+entry.getValue());
//                            }
//                        }
//                );

        textile.forEach(entry -> {
            System.out.println("Textiles left: "+String.join(","));
        });

        medicaments.forEach(entry-> {
            System.out.println("Medicaments left: "+entry + " ");
        });


    }
}
