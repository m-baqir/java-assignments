/**
 * methods of coinflip program.
 * 
 * @author Mohammad baqir
 * @version 1.0
 */
public class CoinFlip {
        // declare array and variables
        private static boolean[] toss = new boolean[100];
        static int head = 0, tail = 0, hMultiRun = 0, tMultiRun = 0, hRun = 0, tRun = 0, index = 0;

        // performs the toss and stores the outcome via store method
        /**
         * @param none
         */
        public static void flipIt() {
                for (int i = 0; i < toss.length; i++) {
                        double face = Math.random();
                        boolean outcome;
                        if (face > 0.5) {
                                outcome = true;
                        } else {
                                outcome = false;
                        }
                        store(outcome);
                }
        }

        // stores the outcome from flipIt method
        /**
         * 
         * @param outcome
         */
        private static void store(boolean outcome) {
                toss[index] = outcome;
                if (outcome) {
                        head++;
                        hRun++;
                        tMultiRun = Math.max(tMultiRun, tRun);
                        tRun = 0;
                } else {
                        tail++;
                        tRun++;
                        hMultiRun = Math.max(hMultiRun, hRun);
                        hRun = 0;
                }
                index++;
                hMultiRun = Math.max(hMultiRun, hRun);
                tMultiRun = Math.max(tMultiRun, tRun);
        }

        // method for displaying the results to screen
        /**
         * @param none
         */
        public static void display() {
                int line = 0;
                int counter = 0;

                while (line < 10) {
                        for (int i = 0; i < 10; i++) {
                                if (toss[counter]) {
                                        System.out.print("heads ");
                                } else {
                                        System.out.print("tails ");
                                }
                                counter++;
                        }
                        System.out.println();
                        line++;
                }
                System.out.println("\nTotal number of times the coin was flipped: " + counter);
                System.out.println("Heads: " + head);
                System.out.println("Tails: " + tail);
                System.out.println("\nThe longest run of Heads is: " + hMultiRun);
                System.out.println("The longest run of Tails is: " + tMultiRun);
        }

}
