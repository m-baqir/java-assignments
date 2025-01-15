/**
 * @author Mohammad Baqir
 * @version 1.0
 */
public class TestRectangle {
    // main method to make calls
    public static void main(String[] args) {
        // create first rectangle object
        Rectangle rec1 = new Rectangle();
        // print rectangle dimensions
        System.out.println(rec1.toString());
        // create 2nd rectangle object with params
        Rectangle rec2 = new Rectangle(15, 16);
        // print rectangle dimensions
        System.out.println(rec2.toString());
        rec1.setLength(13);
        rec1.setWidth(14);
        // print rectangle dimensions
        System.out.println(rec1.toString());
        Rectangle[] recArray = new Rectangle[10];
        int count1 = 1, count2 = 11;
        // set 10 rectangle dimensions
        for (int i = 0; i < recArray.length; i++) {
            recArray[i] = new Rectangle(count1, count2);
            count1++;
            count2--;
        }
        // print rectangle dimensions
        for (int i = 0; i < recArray.length; i++) {
            System.out.println(recArray[i]);
        }
        // create 3rd and 4th rectangle objects
        Rectangle rec3 = new Rectangle();
        Rectangle rec4 = new Rectangle();
        // set rectangle 4 dimensions
        rec4.setLength_Width(10, 20);
        // compare rectangle 3 and 4
        rec3.equals(rec4);
    }
}
