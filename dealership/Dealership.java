package dealership;

import java.util.ArrayList;
import java.util.Collection;

public class Dealership {
    //Next, write a Java class Dealership that has data (Collection, which stores the entity Car).
    // All entities inside the repository have the same fields. Also, the Dealership class should have those public fields:
    //•	name: String
    //•	capacity: int

    private Collection<Car> data;

    public String name;
    public int capacity;
    public String getName() {
        return name;
    }

    public Collection<Car> getData() {
        return this.data;
    }
//The class constructor should receive the name and capacity, also it should initialize the data with a new instance of the collection.

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data=new ArrayList<>();
    }
    //Implement the following features:
    //•	Field data – Collection that holds added cars
    //•	Method add(Car car) – adds an entity to the data if there is an empty cell for the car.
    public void add(Car car){
        if(data.size() < this.capacity){
            data.add(car);
        }
    }
    //•	Method buy(String manufacturer, String model) – removes the car by given manufacturer and model, if such exists, and returns boolean.
    public boolean buy(String manufacturer,String model){
        for (Car car : this.data) {
            if(car.getManufacturer().equals(manufacturer)&& car.getModel().equals(model)){
                this.data.remove(car);
                return true;
            }
        }
        return false;
    }
    //•	Method getLatestCar() – returns the latest car (by year) or null if have no cars
    public Car getLatestCar(){
        Car car=null;
        int lastCar=Integer.MIN_VALUE;
        for (Car currentCar : this.data) {
            if(currentCar.getYear() > lastCar){
                lastCar=currentCar.getYear();
                car=currentCar;
            }
        }
        return car;
    }
    //•	Method getCar(String manufacturer, String model) – returns the car with the given manufacturer and model or null if there is no such car.
    public Car getCar(String manufacturer,String model){
        for (Car car:this.data){
            if(car.getManufacturer().equals(manufacturer)&& car.getModel().equals(model)){
                return car;
            }
        }
        return null;
    }
    //•	Getter getCount() – returns the number of cars.
    public int getCount(){
        return data.size();
    }
    //•	getStatistics() – returns a String in the following format:
    //o	" The cars are in a car dealership {name}:
    //{Car1}
    //{Car2}
    //(…)"
    public String getStatistics(){
        StringBuilder builder=new StringBuilder();
        builder.append(String.format("The cars are in a car dealership %s%n",this.name));
        for (Car car:this.data){
            builder.append(car.toString()).append(System.lineSeparator());
        }
        return builder.toString();
    }

}
