package ClassesExercise.FirstTask.Google;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        Map<String,Person>personMap=new HashMap<>();

        while (!input.equals("End")){
            //•	"{Name} company {companyName} {department} {salary}"
            //•	"{Name} pokemon {pokemonName} {pokemonType}"
            //•	"{Name} parents {parentName} {parentBirthday}"
            //•	"{Name} children {childName} {childBirthday}"
            //•	"{Name} car {carModel} {carSpeed}"
            String[] datePerson=input.split("\\s+");
            String name=datePerson[0];
            if(!personMap.containsKey(name)){
                personMap.put(name,new Person());
            }
            String secondCommand=datePerson[1];
            switch (secondCommand){
                case "company":
                    String companyName=datePerson[2];
                    String department=datePerson[3];
                    double salary=Double.parseDouble(datePerson[4]);
                    Company company=new Company(companyName,department,salary);
                    personMap.get(name).setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName=datePerson[2];
                    String pokemonType=datePerson[3];
                    Pokemon pokemon=new Pokemon(pokemonName,pokemonType);
                    personMap.get(name).getPokemons().add(pokemon);
                    break;
                case "parents":
                    String paretsName=datePerson[2];
                    String partentsBirthday=datePerson[3];
                    Parents parents=new Parents(paretsName,partentsBirthday);
                    personMap.get(name).getParents().add(parents);
                    break;
                case "children":
                    String childrenName=datePerson[2];
                    String childrenBithday=datePerson[3];
                    Children children=new Children(childrenName,childrenBithday);
                    personMap.get(name).getChildred().add(children);
                    break;
                case "car":
                    String carModel=datePerson[2];
                    int carSpeeed=Integer.parseInt(datePerson[3]);
                    Car car=new Car(carModel,carSpeeed);
                    personMap.get(name).setCar(car);
                    break;
            }
            input=scanner.nextLine();
        }

        String lastName=scanner.nextLine();
        System.out.println(lastName);

         Person myPerson=personMap.get(lastName);
        System.out.println(myPerson);



    }
}
