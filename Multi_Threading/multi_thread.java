public class bin extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        bin b1 = new bin();
        bin b2 = new bin();
        b1.start();
        b2.start();

        try {
            b1.join(); // Wait for b1 to finish
            b2.join(); // Wait for b2 to finish
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }
}
