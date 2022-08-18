package derived;

import base.Engine;

public class ElectricEngine extends Engine {

    private String fuelType;


    public ElectricEngine(long modelNo, double maxPower, double maxRpm, String fuelType) {
        super(modelNo, maxPower, maxRpm);
        this.fuelType = fuelType;

    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void show() {

        display();
        System.out.println("Fuel Type = " + getFuelType() + "\n");
    }
}
