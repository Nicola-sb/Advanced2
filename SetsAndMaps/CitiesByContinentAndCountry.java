package SetsAndMaps;

import java.util.*;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        Map<String, Map<String,List<String>>>mapToPrint=new LinkedHashMap<>();


        while (n>0){
            String []continets=scanner.nextLine().split("\\s+");

            String continent=continets[0];
            String country=continets[1];
            String town=continets[2];

            mapToPrint.putIfAbsent(continent,new LinkedHashMap<>());

            Map<String,List<String>>countries=mapToPrint.get(continent);

            countries.putIfAbsent(country,new ArrayList<>());

            List<String> cities=countries.get(country);

            cities.add(town);
          n--;
        }

        mapToPrint.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey()+ ":");
            entry.getValue().entrySet().stream().
                    forEach(innerEntry-> {
                String cities=String.join(", ",innerEntry.getValue());
                        System.out.println(" "+innerEntry.getKey()+ " -> "+cities);
            });
        });
    }
}
