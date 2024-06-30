package MultiThreading;

public class ThreadSequence {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread("Thread 1"));
        Thread t2 = new Thread(new MyThread("Thread 2"));
        Thread t3 = new Thread(new MyThread("Thread 3"));

        try {
            // Start Thread 1
            t1.start();
            t1.join(); // Wait for Thread 1 to finish

            // Start Thread 2 after Thread 1 ends
            t2.start();
            t2.join(); // Wait for Thread 2 to finish

            // Start Thread 3 after Thread 2 ends
            t3.start();
            t3.join(); // Wait for Thread 3 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class MyThread implements Runnable {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " starts.");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name + " ends.");
        }
    }
}
