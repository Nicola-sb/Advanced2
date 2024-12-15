package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command=scanner.nextLine();
        ArrayDeque<String>printQueue=new ArrayDeque<>();

        while (!command.equals("print")){

            if(command.equals("cancel")){
                if(printQueue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else{
                    String canceledCommand=printQueue.poll();
                    System.out.println("Canceled "+ canceledCommand);
                }

            }else{
                printQueue.offer(command);
            }
            command=scanner.nextLine();
        }

        for (String element:printQueue){
            System.out.println(element);
        }
    }
}
