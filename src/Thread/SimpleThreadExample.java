class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
}

public class SimpleThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();  // Create an instance of MyThread
        thread.start();  // Start the thread
    }
}
