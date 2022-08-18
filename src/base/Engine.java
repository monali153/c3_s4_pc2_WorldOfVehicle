package base;

public class Engine {

    private long modelNo;
    private double maxPower;
    private double maxRpm;


    public Engine(long modelNo, double maxPower, double maxRpm) {
        this.modelNo = modelNo;
        this.maxPower = maxPower;
        this.maxRpm = maxRpm;
    }

    public long getModelNo() {
        return modelNo;
    }

    public void setModelNo(long modelNo) {
        this.modelNo = modelNo;
    }


    public double getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }

    public double getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(double maxRpm) {
        this.maxRpm = maxRpm;
    }

    public void display() {
        System.out.println("Model No = " + getModelNo());
        System.out.println("Max Power = " + getMaxPower());
        System.out.println("Max RPM = " + getMaxRpm());
    }
}
