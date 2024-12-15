package SetsAndMapsExercise;

import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Set<String>periodicTable=new TreeSet<>();

        for(int i=1 ;i<=n ;i++){
            String[] chemichalElements=scanner.nextLine().split("\\s+");
//           for (String element:chemichalElements){
//               periodicTable.add(element);
//           }
            //2ри начин
//            Collections.addAll(Arrays.asList(chemichalElements),periodicTable);
            //Трябва да прервърна масива chemichalElements в List за да мога да ползвам Колекцията addAll-->
            //Прави си с Arrays.asList
            //3ти начин
            periodicTable.addAll(Arrays.asList(chemichalElements));
        }

        periodicTable.forEach(element -> System.out.print(element+ " "));
    }
}
