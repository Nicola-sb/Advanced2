package DefinndingClasses.CarConstuctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());
        List<Car>carsCollection=new ArrayList<>();

        for(int i=1 ;i<=n ;i++){
            String[]carData=scanner.nextLine().split(" ");
            String brand=carData[0];

            Car car;//Изкаравне на променливата car ; Когато няма new,реално още не съм си създал обекта
            //Първо си изкарваме промнеливата и след това решавам кой конструктор да ползвам

            //Обекта си го създавам долу в if/else проверката в зависимист от това,колко ми е дълъг масива
            //И накрая си добавям обекта към листа

            if(carData.length==1){
                car=new Car(brand);
            }else{
                car=new Car(brand,carData[1], Integer.parseInt(carData[2]));
            }

            carsCollection.add(car);
        }

        carsCollection.forEach(car -> System.out.println(car.carInfo()));
    }
}
