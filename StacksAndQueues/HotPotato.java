package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]names=scanner.nextLine().split(" ");
        int n=Integer.parseInt(scanner.nextLine());
        ArrayDeque<String>namesDeque=new ArrayDeque<>();


        for (String element : names){
            namesDeque.offer(element);
        }
        while (namesDeque.size() !=1){
            for(int i=1 ;i< n ;i++){
                String firstName=namesDeque.pop();
                namesDeque.offer(firstName);
            }
            String removedName=namesDeque.poll();
            System.out.println("Removed "+removedName);

        }
        System.out.println("Last is "+ namesDeque.pop());

    }
}
