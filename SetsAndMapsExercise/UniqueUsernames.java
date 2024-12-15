package SetsAndMapsExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int n=Integer.parseInt(scanner.nextLine());
//        Set<String>uniqueUsernames=new LinkedHashSet<>();
//        for(int i=0 ;i<n ;i++){
//            String username=scanner.nextLine();
//
//            uniqueUsernames.add(username);
//        }
//
//
//        for (String element:uniqueUsernames){
//            System.out.println(element);
//        }

        int n=Integer.parseInt(scanner.nextLine());
        Set<String>uniqueNames=new LinkedHashSet<>();
        while (n>0){
            String name=scanner.nextLine();

            uniqueNames.add(name);
            n--;
        }

        uniqueNames.stream().forEach(entry-> System.out.println(entry));
    }
}
