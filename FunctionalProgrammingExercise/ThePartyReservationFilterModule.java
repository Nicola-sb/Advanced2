package FunctionalProgrammingExercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String>guests= Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Set<String>filters=new HashSet<>();

        String command=scanner.nextLine();
        while (!command.equals("Print")){
            String []commandParts=command.split(";");
            String addOrRemove=commandParts[0];
            String type=commandParts[1];
            String parametar=commandParts[2];

            if(addOrRemove.equals("Add filter")){
                filters.add(type + ";" + parametar);
            }else{
                filters.remove(type + ";" + parametar);
            }
            command=scanner.nextLine();
        }

        filters.forEach(filter -> {
            Predicate<String>filterToApply=getPredicate(filter);
            guests.removeIf(filterToApply);
        });

        guests.forEach(name -> System.out.print(name + " "));
    }

    private static Predicate<String> getPredicate(String filter) {
        String []filterParts=filter.split(";");
        String filterType=filterParts[0];
        String parametar=filterParts[1];
        switch (filterType){
            case "Starts with":
                return s -> s.startsWith(parametar);
            case "Ends with":
                return  s -> s.endsWith(parametar);
            case "Lenght":
                return s -> s.length() == Integer.parseInt(parametar);
            case "Contains":
                return s -> s.contains(parametar);
        }
        return null;
    }
}
