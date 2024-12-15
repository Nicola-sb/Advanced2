package SetsAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String,String> phoneBookMap=new LinkedHashMap<>();
        String command=scanner.nextLine();
        while (!command.equals("search")){
            String [] input=command.split("-");
            String name=input[0];
            String phonenumber=input[1];

            phoneBookMap.put(name,phonenumber);
            command=scanner.nextLine();
        }

        String secondCommand=scanner.nextLine();
        while (!secondCommand.equals("stop")){
            if(phoneBookMap.containsKey(secondCommand)){
                System.out.printf("%s -> %s%n",secondCommand,phoneBookMap.get(secondCommand));
            }else{
                System.out.printf("Contact %s does not exist.%n",secondCommand);
            }
            secondCommand=scanner.nextLine();
        }


    }
}
