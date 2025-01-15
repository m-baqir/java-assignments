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
                        // wait();
                        throw new InterruptedException("Producer is waiting for consumer to consumer the items.");
                    int value = random.nextInt(2024) + 1;
                    System.out.println("Producer: added- " + value);
                    myList.add(value);
                    // notify();
                    Thread.sleep(1);
                }
            }
        }

        public void consumer() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (myList.size() == 0)
                        // wait();
                        throw new InterruptedException("Consumer is waiting for producer to produce the items.");
                    int value = myList.removeFirst();
                    System.out.println("Consumer: deleted- " + value);
                    // notify();
					// in this case, the producer keeps producing and hits the limit and throws exception. the consumer then takes over and deletes the whole list. but because the notify() has been commented out, there is no communication and the producer does not get activated. hence, the consumer throws its own exception that there is nothing to consume anymore.
                    Thread.sleep(1);
                }
            }
        }
    }
}
