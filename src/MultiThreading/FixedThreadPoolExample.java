package MultiThreading;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FixedThreadPoolExample {
    public static void main(String[] args) throws InterruptedException {
        // Create a fixed thread pool with 3 threads
        int numThreads = 3;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        // Submit multiple tasks to the executor
        for (int i = 1; i <= 5; i++) {
            executor.submit(new TaskRunnable(i));
        }

        executor.shutdown();

        executor.awaitTermination(10, TimeUnit.SECONDS);

        executor.shutdownNow();
    }

    static class TaskRunnable implements Runnable {
        private int taskId;
        private Random random = new Random();

        public TaskRunnable(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            try {
                String threadName = Thread.currentThread().getName();
                System.out.println("Task " + taskId + " executed by " + threadName);
                int sleepTime = random.nextInt(5) + 1;
                Thread.sleep(sleepTime * 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Task " + taskId + " interrupted");
            }
        }
    }
}
