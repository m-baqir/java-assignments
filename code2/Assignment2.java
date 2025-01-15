import java.util.LinkedList;
import java.util.Random;

/**
 * This class represents a program that demonstrates the producer-consumer
 * problem using threads.
 */
public class Assignment2 {
    /**
     * The main method of the program.
     *
     * @param args The command line arguments.
     * @throws InterruptedException If the thread is interrupted.
     */
    public static void main(String[] args) throws InterruptedException {
        final ProducerConsumer pc = new ProducerConsumer();
        // create a producer thread
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        // create a consumer thread
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();
    }

    /**
     * This class represents the producer-consumer problem.
     */
    public static class ProducerConsumer {
        LinkedList<Integer> myList = new LinkedList<>();
        int size = 870;
        Random random = new Random();

        /**
         * The producer method.
         *
         * @throws InterruptedException If the thread is interrupted.
         */
        public void producer() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (myList.size() == size)
                        wait();
                    // add a random number to the list
                    int value = random.nextInt(2024) + 1;
                    System.out.println("Producer: added- " + value);
                    myList.add(value);
                    // wake up consumer
                    notify();
                    Thread.sleep(100);
                }
            }
        }

        /**
         * The consumer method.
         *
         * @throws InterruptedException If the thread is interrupted.
         */
        public void consumer() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (myList.size() == 0)
                        wait();
                    // remove first element from the list
                    int value = myList.removeFirst();
                    System.out.println("Consumer: deleted- " + value);
                    // wake up producer
                    notify();
                    Thread.sleep(100);
                }
            }
        }
    }
}
