package derivedClass;


import derived.IcEngine;

public class PetrolEngine extends IcEngine {

    private String fuelType;

    public PetrolEngine(long modelNo, double displacement, double maxPower, double maxRpm, String fuelType) {
        super(modelNo, displacement, maxPower, maxRpm);
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
