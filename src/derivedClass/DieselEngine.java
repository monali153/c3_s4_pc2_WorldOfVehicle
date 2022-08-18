package derivedClass;

import derived.IcEngine;

public class DieselEngine extends IcEngine {

    private String fuelType;

    public DieselEngine(long modelNo, double displacement, double maxPower, double maxRpm, String fuelType, int noOfCylinder) {
        super(modelNo, displacement, maxPower, maxRpm, noOfCylinder);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void show() {

        print();
        System.out.println("Fuel Type = " + getFuelType() + "\n");
    }
}
