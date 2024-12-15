package SetsAndMaps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[]numbers= Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        //-2.5 4 3 -2.5 -5.5 4 3 3 -2.5 3

        Map<Double,Integer>resultMap=new LinkedHashMap<>();

        for(int i=0 ;i< numbers.length ;i++){
            double currentElement=numbers[i];

            if(resultMap.containsKey(currentElement)){
                int currentValue=resultMap.get(currentElement);
                resultMap.put(currentElement,currentValue+1);
            }else{
                resultMap.put(currentElement,1);
            }
        }

        for (Double entry:resultMap.keySet()){
            System.out.printf("%.1f -> %d%n",entry,resultMap.get(entry));
        }



//        for (Map.Entry<Double, Integer> entry : resultMap.entrySet()) {
//            System.out.printf("%.1f -> %d%n",entry.getKey(),entry.getValue());
//        }

    }
}
