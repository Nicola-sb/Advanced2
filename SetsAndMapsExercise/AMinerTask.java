package SetsAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String,Integer>minerTask=new LinkedHashMap<>();
        String command=scanner.nextLine();
        while (!command.equals("stop")){
            String resourse=command;
            int quantity=Integer.parseInt(scanner.nextLine());
            if(!minerTask.containsKey(resourse)){
                minerTask.put(resourse,quantity);
            }else{
                int currentQuantity=minerTask.get(resourse);
                minerTask.put(resourse,currentQuantity+quantity);
            }
            command=scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : minerTask.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

    }
}
