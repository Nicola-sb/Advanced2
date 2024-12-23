package StackAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=scanner.nextInt();
        int s=scanner.nextInt();
        int x=scanner.nextInt();

        ArrayDeque<Integer>printQueueNumbers=new ArrayDeque<>();

        for(int i=0 ;i<n ;i++){
            printQueueNumbers.offer(scanner.nextInt());
        }

        for(int i=0 ;i<s ;i++){
            printQueueNumbers.poll();
        }

        if(printQueueNumbers.contains(x)){
            System.out.println("true");
        }else{
            if(printQueueNumbers.isEmpty()){
                System.out.println(0);
            }else{
                System.out.println(Collections.min(printQueueNumbers));
            }
        }

    }
}
