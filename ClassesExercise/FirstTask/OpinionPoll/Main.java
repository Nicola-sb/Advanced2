package ClassesExercise.FirstTask.OpinionPoll;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Create Person class with two fields String name and int age.
        // Write a program that reads from the console N lines of personal information
        // and then prints all people whose age is more than 30 years, sorted in alphabetical order.

        Map<String,Integer>mapPerson=new TreeMap<>();
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1 ;i<=n ;i++){
            String []personData=scanner.nextLine().split(" ");
            String personName=personData[0];
            int age=Integer.parseInt(personData[1]);

            Person person=new Person(personName,age);
            if(age > 30){
                mapPerson.put(personName,age);
            }
        }

        mapPerson.entrySet().forEach(entry -> System.out.println(entry.getKey()+" - "+entry.getValue()));
        //Ако задачата я направя с Лист<Person>peopleList=new ArrayList<>();

        //При принтирането ->,
        //Първо ще си сортирам лист по име(name) ->
        //personList.sort(Comparator.comparing(person -> person.getName())); // за целта трябва да си направя гетър за името (name)

        //Ако искам да ги изпозлвам филтър-->
        //peopleList=peopleList.stream().filter(person -> person.getAge() >30).collect(Collectiors.toList());

        //След това си отпечатвам списъка с forEach
        //  for(Person person:peopleList){
            //трябва да си направя гетър и за възрастта за мога да я отпечатам
        //System.out.println(person.getName() + " - " + person.getAge()));
    }
}
