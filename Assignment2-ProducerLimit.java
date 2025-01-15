import java.util.LinkedList;
import java.util.Random;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        final ProducerConsumer pc = new ProducerConsumer();
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

    public static class ProducerConsumer {
        LinkedList<Integer> myList = new LinkedList<>();
        int size = 870;
        Random random = new Random();

        public void producer() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (myList.size() == size)
                        // the wait() function is replaced with a throw exception command.
                        throw new InterruptedException("Producer is waiting for consumer to consume the items.");
                    int value = random.nextInt(2024) + 1;
                    System.out.println("Producer: added- " + value);
                    myList.add(value);
                    // notify();
					// when notify() is commented out, it is unable to notify the consumer to consume. hence the producer keeps adding until reaching the limit of 870 and then throws exception
                    Thread.sleep(10);
                }
            }
        }

        public void consumer() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (myList.size() == 0)
                        wait();
                    int value = myList.removeFirst();
                    System.out.println("Consumer: deleted- " + value);
                    notify();
                    Thread.sleep(10);
                }
            }
        }
    }
}
