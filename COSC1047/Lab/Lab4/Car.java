package Lab4;

public class Car extends Vehicle implements Drivable, Comparable<Car> {
    private String model = "";
    private int speed;

    public Car() {
        this.speed = 0;
    }

    public Car(String model, int speed) {
        this.speed = speed;
        this.model = model;
    }

    @Override
    public void steer() {
        System.out.println("Turn steering wheel");
    }

    @Override
    public int compareTo(Car o) {
        if (getSpeed() > o.getSpeed())
            return 1;
        else if (getSpeed() < o.getSpeed())
            return -1;
        else
            return 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getModel() {
        return this.model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String howToDrive() {
        return "Step on gas pedal";
    }

    @Override
    public boolean equals(Object other) {
        if (this.getModel() == ((Car) other).getModel())
            return true;
        else
            return false;
    }

}
