package MAIN_NOTES;
public class InterThreadCommunication {
    private static class Data {
        private int content;
        private boolean available = false;

        public synchronized void produce(int value) {
            while (available) {
                try {
                    wait(); // Wait until the data is consumed
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            content = value;
            available = true;
            notify(); // Notify the consumer that the data is ready
        }

        public synchronized int consume() {
            while (!available) {
                try {
                    wait(); // Wait until data is produced
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            available = false;
            notify(); // Notify the producer that the data has been consumed
            return content;
        }
    }

    public static void main(String[] args) {
        Data data = new Data();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                data.produce(i);
                System.out.println("Produced: " + i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                int value = data.consume();
                System.out.println("Consumed: " + value);
            }
        });

        producer.start();
        consumer.start();
    }
}
