package ClassesExercise.FirstTask.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int n=Integer.parseInt(scanner.nextLine());
        Map<String,Car>carMap=new LinkedHashMap<>();
            for(int i=1 ;i<=n ;i++){
                //"{Model} {FuelAmount} {FuelCostFor1km}", all cars start at 0 kilometers traveled
                String[]infoCar=scanner.nextLine().split("\\s+");
                String model=infoCar[0];
                double fuelAmount=Double.parseDouble(infoCar[1]);
                double fuelCostFor1Km=Double.parseDouble(infoCar[2]);

                Car car=new Car(model,fuelAmount,fuelCostFor1Km);
                carMap.put(model,car);
            }


            String command=scanner.nextLine();
            while (!command.equals("End")){
           //"{Model} {fuelAmount} {distanceTraveled}",
                //Когато получа командата Drive аз трябва да търся коя точно кола ще ги кара тези км-> за това е по-удобно да ги съхранявам в мап;имам бърз и лесен достъп

            String carModelToDrive=command.split("\\s+")[1];
            int kmToDrive=Integer.parseInt(command.split("\\s+")[2]);

                //Взимам коя кола ще карам
                //Ще си взема един обект(carToDrive) и тя е равна на-> от мапа carsMap си взимам срещи модела кола(carModelToDrive),коя точно кола стои
                Car carToDrive=carMap.get(carModelToDrive);
                //Взимам коя кола ще карам за да мога на тази кола която ще карам да знам кои е модел,налично количество,км
// implement a method in the Car class to calculate whether a car can move that distance or not.
// If it yes, the car fuel amount should be reduced by the amount of used fuel and its distance traveled should be increased by the amount of kilometers traveled
                //ТРЯБВА ДА ИМПЛЕМЕНТИРАМЕ МЕТОД В КЛАС CAR КОЙТО ДА ИЗЧИСЛЯВА ДАЛИ КОЛАТА ЩЕ МОЖЕ ДА СЕ КАРА ИЛИ НЕ

                //drive->false-> горивото не ни стига, за да изминем разстоянието
                //drive -> true -> горивото е стигнало и ние сме изминали разстоянието
                if(!carToDrive.drive(kmToDrive)){//Проверявам дали тази кола(carToDrive) не може да се кара толкова км(kmToDrive) -> Ако не може принтирам
                    System.out.println("Insufficient fuel for the drive");
                }
                command=scanner.nextLine();
            }
            //After the "End" command is received, print each car in order of appearing in input and its current fuel amount and distance traveled in the format
            // "{Model} {fuelAmount} {distanceTraveled}"

            for (Car car:carMap.values()){
                System.out.println(car.toString());//override toString
            }
    }
}
