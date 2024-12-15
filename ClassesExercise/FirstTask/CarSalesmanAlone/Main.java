package ClassesExercise.FirstTask.CarSalesmanAlone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<Engine>engineList=new ArrayList<>();
        //ДВИГАТЕЛ
        for(int i=1 ;i<=n ;i++){
            String []engineData=scanner.nextLine().split("\\s+");
            //"{Model} {Power} {Displacement} {Efficiency}"
            String model=engineData[0];
            int power=Integer.parseInt(engineData[1]);
            //Engine displacements, and efficiency are optional
            int displacement=0;
            String efficiency=null;

            if(engineData.length==4){
                displacement=Integer.parseInt(engineData[2]);
                efficiency=engineData[3];
            }else if(engineData.length==3){
                //Имам 2 варианта
                //1. "{Model} {Power} {Displacement} -> това ми е число и мога да направя проверка с isDigit
                //2. "{Model} {Power} {Efficiency}"
                if(Character.isDigit(engineData[2].charAt(0))){
                    displacement=Integer.parseInt(engineData[2]);
                }else{
                    efficiency=engineData[2];
                }
            }
            Engine engine=new Engine(model,power,displacement,efficiency);
            engineList.add(engine);
        }

        int m=Integer.parseInt(scanner.nextLine());
        for(int i=1 ;i<=m ;i++){
            String[]carInfo=scanner.nextLine().split("\\s+");
            //"{Model} {Engine} {Weight} {Color
            //where the engine in the format will be the model of an existing Engine
            String model=carInfo[0];
            String engine=carInfo[1];

            int weight=0;
            String color=null;

             if(carInfo.length==4){
                 weight=Integer.parseInt(carInfo[2]);
                 color=carInfo[3];
             }else if(carInfo.length==3){
                 //Имам 2 варианта
                 //1."{Model} {Engine} {Weight}
                 //2."{Model} {Engine} {Color}",
                 if(Character.isDigit(carInfo[2].charAt(0))){
                     weight=Integer.parseInt(carInfo[2]);
                 }else{
                     color=carInfo[2];
                 }
             }
             Engine engine1=null;
             for (Engine engineElement:engineList){
                 if(engine.equals(engineElement.getModel())){
                     engine1=engineElement;
                 }
             }
             Car car=new Car(model,engine1,weight,color);
            System.out.print(car.toString());
        }


    }
}
