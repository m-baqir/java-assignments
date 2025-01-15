package Lab4;

public abstract class Vehicle {
    private String color = "";
    java.util.Date dateMade;

    abstract void steer();

    protected Vehicle() {
        dateMade = new java.util.Date();
    }

    protected Vehicle(String color) {
        dateMade = new java.util.Date();
        this.color = color;
    }

    public String getColour() {
        return this.color;
    }

    public java.util.Date getDateMade() {
        return this.dateMade;
    }

    public void setColour(String color) {
        this.color = color;
    }
}
