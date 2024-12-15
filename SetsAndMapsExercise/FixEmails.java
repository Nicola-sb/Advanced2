package SetsAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String,String>emailsMap=new LinkedHashMap<>();
        String name=scanner.nextLine();

        while (!name.equals("stop")){
            String email=scanner.nextLine();

            if(!email.endsWith("us")&& !email.endsWith("uk")&& !email.endsWith("com")){
                emailsMap.put(name,email);
            }

            name=scanner.nextLine();
        }

       emailsMap.entrySet().forEach(entry -> System.out.println(entry.getKey()+" -> "+entry.getValue()));
    }
}
