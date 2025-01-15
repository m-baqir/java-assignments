package Lab4;

public class TestCar {
    public static void main(String[] args) {
        System.out.println("Car1:");
        Car car1 = new Car("Toyota", 50);
        System.out.println("Colour: " + car1.getColour());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Speed: " + car1.getSpeed());
        System.out.println("Date Made: " + car1.getDateMade());
        car1.steer();

        System.out.println("Car2:");
        Car car2 = new Car("Honda", 40);
        car2.setColour("Silver");
        System.out.println("Colour: " + car2.getColour());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Speed: " + car2.getSpeed());
        System.out.println("Date Made: " + car2.getDateMade());
        System.out.println(car2.howToDrive());

        System.out.println("Is car 1 equal to car 2? " + car1.equals(car2));

        System.out.println("Is car 1 traveling faster (1), same speed (0), or slower (-1) than car 2?");
        System.out.println(car1.compareTo(car2));
    }
}
