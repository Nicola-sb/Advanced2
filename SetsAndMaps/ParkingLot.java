package SetsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command=scanner.nextLine();
        LinkedHashSet<String> dataNumber=new LinkedHashSet<>();
        while (!command.equals("END")){
            String[] inputData=command.split(",\\s+");
            String direction=inputData[0];
            String carNumber=inputData[1];

            if(direction.equals("IN")){
                dataNumber.add(carNumber);
            }else if(direction.equals("OUT")){
                if(dataNumber.contains(carNumber)){
                    dataNumber.remove(carNumber);
                }
            }

            command=scanner.nextLine();
        }

        for (String element:dataNumber){
            System.out.println(element);
        }
        if(dataNumber.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
    }
}
