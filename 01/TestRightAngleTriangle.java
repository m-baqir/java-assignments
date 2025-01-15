public class TestRightAngleTriangle {
    public static void main(String[] args) {
        // create first triangle object
        RightAngleTriangle tri1 = new RightAngleTriangle();
        // print triangle dimensions
        System.out.println(tri1.toString());
        // create 2nd triangle object with params
        RightAngleTriangle tri2 = new RightAngleTriangle(15, 16);
        // print triangle dimensions
        System.out.println(tri2.toString());
        tri1.setBase(13);
        tri1.setHeight(14);
        // print triangle dimensions
        System.out.println(tri1.toString());
        RightAngleTriangle[] triArray = new RightAngleTriangle[5];
        int count1 = 1, count2 = 11;
        // set 5 triangle dimensions
        for (int i = 0; i < triArray.length; i++) {
            triArray[i] = new RightAngleTriangle(count1, count2);
            count1++;
            count2--;
        }
        // print triangle dimensions
        for (int i = 0; i < triArray.length; i++) {
            System.out.println(triArray[i]);
        }
        // create 3rd and 4th triangle objects
        RightAngleTriangle tri3 = new RightAngleTriangle();
        RightAngleTriangle tri4 = new RightAngleTriangle();
        // set triangle 2 dimensions
        tri4.setBaseAndHeight(10, 20);
        // compare triangle 3 and 4
        tri3.equals(tri4);
    }
}
