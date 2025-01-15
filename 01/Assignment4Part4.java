public class Assignment4Part4 {
    public static void main (String[] args){
        int rows = 8;
        int k=0;
        //main loop for creating rows
        for (int a = 1; a <= rows; a++) {
          for (int b = 1; b <= 2 * rows; b++) {
            if (b == rows + 1) {
              continue;
            }
            if (b<rows+1){
                k=b;
            }
            else{
                k=2*rows-b+1;
            }
            if (k >= rows + 1 - a) {
              //calculate exponent
              int x = (int) Math.pow(2, (a + k - rows - 1));
              System.out.printf("%3d", x);
            } else {
              //print space
              System.out.print("   ");
            }
            //print space
            System.out.print(" ");
          }
          //next line
          System.out.println();
        }
    }
}
