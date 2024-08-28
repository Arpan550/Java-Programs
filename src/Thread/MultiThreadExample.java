class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("First thread is running");
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Second thread is running");
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1(); // Creating Thread1
        Thread2 thread2 = new Thread2(); // Creating Thread2

        thread1.start(); // Starting Thread1
        thread2.start(); // Starting Thread2

        System.out.println("Main thread is running");
    }
}
