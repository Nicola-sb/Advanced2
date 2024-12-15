package DefinndingClasses;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Car car = new Car();
        car.setBrand("Mercedes");//Ако нямам setBrand --> car.brand="Mercedes";

        car.model="E270";
//        car.hoursePower=177;
        car.setHorsePower(200);

        Car car2=new Car();
        car2.setBrand("Mercedes");
        car2.model="C180";
        car2.setHorsePower(121);


        System.out.printf("The car is: %s %s - %d HP%n",car.getBrand(),car.model,car.getHorsePower());
        System.out.println(String.format("The car is: %s %s - %d HP",car2.getBrand(),car2.model,car2.getHorsePower()));
//
//        Car car2=new Car();
//        car.setName("Djaro");
//        System.out.println(car.getName());
        Dog dog =new Dog();
        dog.setName("Reksiii");
        dog.setAge(12);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.bark();
        int dogMyAge= dog.getAge();//12

        System.out.println(dog.toString());
        System.out.println(dog.hashCode());

        Map<String,Dog>myDogsList=new HashMap<>();
        myDogsList.put("Balkan",dog);



    }
}
