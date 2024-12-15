package ExamPrepation;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BouquetsAlone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String tulips=scanner.nextLine();//стека с тулипс//10, 15, 2, 7, 9, 13
        String dafodills=scanner.nextLine();//опашка с дафо//2, 10, 8, 12, 0, 5

        String[]tulipsArr=tulips.split(",\\s+");
        ArrayDeque<Integer> stacKTulips=new ArrayDeque<>();
        for (String element:tulipsArr){
            stacKTulips.push(Integer.parseInt(element));
        }

        String[]dafodilsArr=dafodills.split(",\\s+");
        ArrayDeque<Integer>dafodilssQueue=new ArrayDeque<>();
        for (String element:dafodilsArr){
            dafodilssQueue.offer(Integer.parseInt(element));
        }
        int countBoquets=0;
        int leftSum=0;

        while (!stacKTulips.isEmpty()&& !dafodilssQueue.isEmpty()){
            int firstElement=stacKTulips.peek();
            int secondElement=dafodilssQueue.peek();
//If the sum of their values is equal to 15 – create one bouquet and remove them.
// While the sum is bigger than 15, keep decreasing the value of the tulips by 2.
// If the sum is less than 15 you have to store them for later and remove them.
            int sum=firstElement+secondElement;
            if(sum==15){
                countBoquets++;
                stacKTulips.pop();
                dafodilssQueue.poll();
            }else if(sum>15){
//                int value=stacKTulips.peek();
//                int newValue=value-2;
                int allCurrentTullips=firstElement-2;
                stacKTulips.pop();
                stacKTulips.push(allCurrentTullips);
            }else{
                leftSum=leftSum+sum;
                stacKTulips.pop();
                dafodilssQueue.poll();
            }
        }
        int maxBouquets=leftSum/15;
        int allBouquet=maxBouquets+countBoquets;

        if(allBouquet>=5){
            System.out.printf("You made it! You go to the competition with %d bouquets!",allBouquet);
        }else{
            System.out.printf("You failed... You need more %d bouquets.",5-allBouquet);
        }
    }
}
