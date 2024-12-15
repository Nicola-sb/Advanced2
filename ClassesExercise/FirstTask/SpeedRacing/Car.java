package ClassesExercise.FirstTask.SpeedRacing;

public class Car {
    //. Define a class Car that keeps track of a car
    // information Model, fuel amount, fuel cost for 1 kilometer, and distance traveled. A Car Model is unique
    // - there will never be 2 cars with the same model
    private String model;
    private double fuelAmount;
    private double fuelCostFor1Km;
    private int distance=0;

    public Car(String model, double fuelAmount, double fuelCostFor1Km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostFor1Km = fuelCostFor1Km;
        this.distance=0;
    }

    // implement a method in the Car class to calculate whether a car can move that distance or not.
    // If it yes, the car fuel amount should be reduced by the amount of used fuel and its distance traveled should be increased by the amount of kilometers traveled

    public boolean drive(int kmToDrive){//целта на метода е да върне true,ако колата може да измине int kmToDrive
      //1.Нужно количество за да преминем kmToDrive
        double fuelNeeded=kmToDrive * this.fuelCostFor1Km;//За да видим колко ще ни е нужното гориво(fuelNeeded) трябва да умножа разстояние(kmToDrive) * цената за 1км(fuelCostFor1Km)
          if(fuelNeeded<=this.fuelAmount){
             //Ако можем да я караме трябва:
              //1.fuel amount should be reduced by the amount of used fuel
              //2. distance traveled should be increased by the amount of kilometers traveled
              this.fuelAmount=this.fuelAmount-fuelNeeded;
              this.distance=this.distance+kmToDrive;
              return true;
          }
            return false;
    }

    @Override
    public String toString() {
        //{Model} {fuelAmount} {distanceTraveled}"
        return String.format("%s %.2f %d",this.model,this.fuelAmount,this.distance);
    }
}
