package ExamPrepation;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Bouquets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tulips=scanner.nextLine();//стека с тулипс//10, 15, 2, 7, 9, 13
        String dafodills=scanner.nextLine();//опашка с дафо//2, 10, 8, 12, 0, 5

        String[]tulipsArr=tulips.split(",\\s+");
        ArrayDeque<Integer>stacKTulips=new ArrayDeque<>();
        for (String element:tulipsArr){
            stacKTulips.push(Integer.parseInt(element));
        }

        String[]dafodilsArr=dafodills.split(",\\s+");
        ArrayDeque<Integer>dafodilssQueue=new ArrayDeque<>();
        for (String element:dafodilsArr){
            dafodilssQueue.offer(Integer.parseInt(element));
        }

        int countBouquets=0;
        int leftsum=0;
//If the sum of their values is equal to 15 – create one bouquet and remove them. While the sum is bigger than 15,
// keep decreasing the value of the tulips by 2. If the sum is less than 15 you have to store them for later and remove them
        while (!stacKTulips.isEmpty() && !dafodilssQueue.isEmpty()){
               int currentTulips=stacKTulips.peek();
               int currentDafo=dafodilssQueue.peek();

               int sum=currentTulips+currentDafo;

               if(sum==15){
                   countBouquets++;
                   stacKTulips.pop();
                   dafodilssQueue.poll();
               }else if(sum > 15){
                  int allCurrentTulips=currentTulips-2;
                   stacKTulips.pop();
                   stacKTulips.push(allCurrentTulips);
               }else if(sum < 15){
                   leftsum=leftsum+sum;
                   stacKTulips.pop();
                   dafodilssQueue.poll();
               }
        }

        int addBouquets=leftsum/15;
        countBouquets=countBouquets+addBouquets;

        if(countBouquets>=5){
            System.out.printf("You made it! You go to the competition with %d bouquets!",countBouquets);
        }else{
            System.out.printf("You failed... You need more %d bouquets.",5-countBouquets);
        }

    }
}
