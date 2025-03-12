package synchronization;

class Counter {
    private int c = 0;

    // synchronized method to increment counter
    public synchronized void inc() {
        c++;
    }

    // synchronized method to get counter value
    public synchronized int get() {
        return c;
    }
}

public class Test {
    public static void main(String[] args) {
        Counter cnt = new Counter();

        // Thread 1 to increment counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cnt.inc();
            }
        });

        // Thread 2 to increment counter
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                cnt.inc();
            }
        });

        t1.start();
        t2.start();

        // wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter " + cnt.get());
    }
}
