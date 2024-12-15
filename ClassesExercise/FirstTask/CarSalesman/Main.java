package ClassesExercise.FirstTask.CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        //НА ДВИГАТЕЛЯ
        List<Engine>engineList=new ArrayList<>();
        for(int i=1 ;i<=n ;i++){
            //on each of the next N lines you will receive information about an Engine in the following format "{Model} {Power} {Displacement} {Efficiency}".
            String []engineInfo=scanner.nextLine().split("\\s+");
            //V8-101 220 50
            //V4-33 140 28 B
            String engineModel=engineInfo[0];
            int powerEngine=Integer.parseInt(engineInfo[1]);

            int displacementEngine=0;
            String efficiencyEngine=null;

            if(engineInfo.length==4){
                displacementEngine=Integer.parseInt(engineInfo[2]);
                efficiencyEngine=engineInfo[3];
            }else if(engineInfo.length==3){
                //V8-101 220 50
                if(Character.isDigit(engineInfo[2].charAt(0))){
                    displacementEngine=Integer.parseInt(engineInfo[2]);
                }else{
                    efficiencyEngine=engineInfo[2];
                }
            }
            Engine engine=new Engine(engineModel,powerEngine,displacementEngine,efficiencyEngine);
            engineList.add(engine);
        }

       int m=Integer.parseInt(scanner.nextLine());
        for(int i=1 ;i<=m ;i++){
            String[] carInfo=scanner.nextLine().split("\\s+");
            //"{Model} {Engine} {Weight} {Color}",
            //where the engine in the format will be the model of an existing Engine.

            //FordFocus V4-33 1300 Silver
            //FordMustang V8-101
            //VolkswagenGolf V4-33 Orange
            String modelCar=carInfo[0];
            String engineCar=carInfo[1];//Модел на двигателя

            int weightCar=0;
            String colorCar=null;
           //VolkswagenGolf V4-33 Orange
            if(carInfo.length==4){
                weightCar=Integer.parseInt(carInfo[2]);
                colorCar=carInfo[3];
            }else if(carInfo.length==3){
                //Имам 2 варианта
                //"{Model} {Engine} {Weight}
                //"{Model} {Engine} {Color}"
                if(Character.isDigit(carInfo[2].charAt(0))){
                    weightCar=Integer.parseInt(carInfo[2]);
                }else{
                    colorCar=carInfo[2];
                }
            }
            //Да  намеря кой е двигателя от въведените
            //списък с налични двигател-> да намеря двигателя
            Engine carEngine=null;//Това ми е двигателя на колата;отначало си го правя на null;после проверя в списъка дали имам такъв двигател и му задавам стойността
            for (Engine engine:engineList){//На всеки един Обект от engine искам да достъпвам и виждам стойнста на modela-> за това си правя гетър getModel
                if(engineCar.equals(engine.getModel())){
                      carEngine=engine;//Така казвам,че двигателя от списъка е равен на модел на двигателя,който търся
                }
            }
            //Вече мога да си създам колата,защото знам модела на колата и вече си знам и кой е двигателя(engine) на колата
            Car car=new Car(modelCar,carEngine,weightCar,colorCar);
            System.out.print(car.toString());
        }


    }
}
