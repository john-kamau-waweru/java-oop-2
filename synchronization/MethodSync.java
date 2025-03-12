package synchronization;

class Line {
    public synchronized void getLine() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Train extends Thread {
    // shared object
    Line line;

    Train(Line line) {
        this.line = line;
    }

    @Override
    public void run() {
        // access the getLine method
        line.getLine();
    }
}

public class MethodSync {
    public static void main(String[] args) {
        Line obj = new Line();

        // Creating the threads that are sharing same object
        Train t1 = new Train(obj);
        Train t2 = new Train(obj);

        // Start threads
        t1.start();
        t2.start();
    }
}
