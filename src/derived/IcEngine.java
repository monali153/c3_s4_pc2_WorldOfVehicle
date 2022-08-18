package derived;

import base.Engine;

public class IcEngine extends Engine {

    private double displacement;
    private int noOfCylinder;

    public IcEngine(long modelNo, double maxPower, double maxRpm, double displacement, int noOfCylinder) {
        super(modelNo, maxPower, maxRpm);
        this.displacement = displacement;
        this.noOfCylinder = noOfCylinder;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public int getNoOfCylinder() {
        return noOfCylinder;
    }

    public void setNoOfCylinder(int noOfCylinder) {
        this.noOfCylinder = noOfCylinder;
    }

    public void print() {
        display();
        System.out.println("Displacement = " + getDisplacement());
        System.out.println("No Of Cylinder = " + getNoOfCylinder());
    }
}
