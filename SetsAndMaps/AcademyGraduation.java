package SetsAndMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String,Double[]> graduationList=new TreeMap<>();

        for(int i=0 ;i<n ;i++){
            String name=scanner.nextLine();
            String []gradeString=scanner.nextLine().split("\\s+");
            Double[]grades=new Double[gradeString.length];

            for(int j=0 ;j<gradeString.length ;j++){
                grades[j]=Double.parseDouble(gradeString[j]);
            }

            graduationList.put(name,grades);

        }

        graduationList.entrySet().forEach(entry ->
                System.out.printf("%s is graduated with %.0f%n",entry.getKey(),entry.getValue(),entry.getValue()));

    }
}
