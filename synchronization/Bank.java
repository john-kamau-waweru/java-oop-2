package synchronization;

class BankAccount {
    private int balance = 1000;

    // Deposit method
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited amount: " + amount + ". Balance is: " + balance);
    }

    // Withdrawal method
    public synchronized void withdaw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw: " + amount);
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        // Shared resource
        BankAccount account = new BankAccount();

        // thread 1 to deposit money into the account
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.deposit(200);
                try {
                    Thread.sleep(50); // simulate some delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 2 to withdraw money from the account
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                account.withdaw(100);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
