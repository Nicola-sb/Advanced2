package ClassesExercise.FirstTask.CarSalesmanAlone;

public class Engine {
    //An Engine has a model, power, displacement, and efficiency
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return this.model;
    }

    public int getPower() {
        return this.power;
    }

    public int getDisplacemnt() {
        return this.displacement;
    }

    public String getEfficiency() {
        return this.efficiency;
    }
}
