package synchronization;

class Booking {
    private int availableTickets = 10;

    public synchronized void bookTicket(int tickets) {
        if (availableTickets >= tickets) {
            availableTickets -= tickets;
            System.out.println("Booked " + tickets + " tickets. Remaining tickets: " + availableTickets);
        } else {
            System.out.println("Not enough tickets available to book " + tickets);
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}

public class Ticket {
    public static void main(String[] args) {
        Booking booking = new Booking();

        // Thread 1 to book tickets
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                booking.bookTicket(2);
                try {
                    Thread.sleep(40); // simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                booking.bookTicket(3);

                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start the threads
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final available tickets: " + booking.getAvailableTickets());
    }
}
