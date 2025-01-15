package Assignment4;

public class TestSquare {
    public static void main(String[] args) {
        /*
         * GeometricObject[] myObjects = { new Square(1), new Square(2), new Square(3),
         * new Square(4), new Square(5) };
         * for (int i = 0; i < myObjects.length; i++) {
         * myObjects[i].setColor("brown");
         * myObjects[i].setFilled(true);
         * if (myObjects[i].isFilled()) {
         * ((Square) myObjects[i]).howToColor();
         * }
         * System.out.println("The area is " + ((Square) myObjects[i]).getSide() *
         * ((Square) myObjects[i]).getSide());
         * }
         */
    }

    public static boolean myInstanceOf(Object o, String s) {
        // i understand how you are saying to use string.split based on the @ symbol
        // delimitation. but i think a better way would be to just see if the string
        // contains a particular substring.
        String myString = o.toString();
        if (myString.contains("Circle") || myString.contains("circle"))
            return true;
        else
            return false;

    }
}
