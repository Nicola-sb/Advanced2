package FunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String,Integer>people=new LinkedHashMap<>();
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=0 ;i<n ;i++){
            String[]personDate=scanner.nextLine().split(", ");
            String personName=personDate[0];
            int personAge=Integer.parseInt(personDate[1]);

            people.put(personName,personAge);
        }

        //Прочели сме си хората и сме си ги запазили в мапа
        //Прочитаме си другите 3 реда
        String comparasion=scanner.nextLine();
        int ageLimit=Integer.parseInt(scanner.nextLine());
        String printType=scanner.nextLine();
        //1.Трябва да си направим стрийм,който да филтрира тези,които не отговарят на възрастовия лимит
        //Predicate-имаме два варианта за предикат-younger,older
        BiPredicate<Integer,Integer>filterPredicat;
        if(comparasion.equals("younger")){
//            filterPredicat=(personAge,age) -> personAge<=age;
            filterPredicat=(agePerson,age123) -> agePerson<=age123;
        }else{
//            filterPredicat=(personAge,age) -> personAge>=age;
            filterPredicat=(ageForPerson,age234) -> ageForPerson>=age234;
        }


        //2.Да принтираме според шаблона
        Consumer<Map.Entry<String,Integer>>printConsumer;
        if(printType.equals("age")){
            printConsumer= person -> System.out.println(person.getValue());
        }else if(printType.equals("name")){
            printConsumer=person -> System.out.println(person.getKey());
        }else{
            printConsumer=person -> System.out.printf("%s - %d%n",person.getKey(),person.getValue());
        }

        //Трябва да преминем през всеки един човек,да го проверим и да го филтрираме през някакъв шаблон
        people.entrySet()
                .stream()
                .filter(person -> filterPredicat.test(person.getValue(),ageLimit))
                .forEach(printConsumer);


    }
}
