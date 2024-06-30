package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(() -> {
            System.out.println("Task 1 executed by " + Thread.currentThread().getName());
        });

        executor.submit(() -> {
            System.out.println("Task 2 executed by " + Thread.currentThread().getName());
        });

        executor.shutdown();
    }
}
