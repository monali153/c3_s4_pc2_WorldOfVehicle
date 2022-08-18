package derived;

import base.Engine;

public class IcEngine extends Engine {

    private double displacement;

    public IcEngine(long modelNo, double maxPower, double maxRpm, double displacement) {
        super(modelNo, maxPower, maxRpm);
        this.displacement = displacement;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public void print() {
        display();
        System.out.println("Displacement = " + getDisplacement());
    }
}
