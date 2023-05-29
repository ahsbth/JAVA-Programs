import java.util.concurrent.TimeUnit;

public class ThreadPriority {

    public static void main(String[] args) throws InterruptedException {

        // Create five threads with different priorities.
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running.");
            }
        }, "Thread 1");
        thread1.setPriority(Thread.MIN_PRIORITY);

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 2 is running.");
            }
        }, "Thread 2");
        thread2.setPriority(Thread.NORM_PRIORITY);

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3 is running.");
            }
        }, "Thread 3");
        thread3.setPriority(Thread.MAX_PRIORITY);

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 4 is running.");
            }
        }, "Thread 4");
        thread4.setPriority(Thread.MAX_PRIORITY);

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 5 is running.");
            }
        }, "Thread 5");
        thread5.setPriority(Thread.MAX_PRIORITY);

        // Start all the threads.
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        // Sleep for 2 seconds.
        TimeUnit.SECONDS.sleep(2);

        // Send two threads of the highest priority to sleep state.
        thread4.join();
        thread5.join();

        // Check the aliveness of the threads.
        System.out.println("Thread 1 is alive: " + thread1.isAlive());
        System.out.println("Thread 2 is alive: " + thread2.isAlive());
        System.out.println("Thread 3 is alive: " + thread3.isAlive());
        System.out.println("Thread 4 is alive: " + thread4.isAlive());
        System.out.println("Thread 5 is alive: " + thread5.isAlive());

        // Mark the thread that is long lasting.
        if (thread1.isAlive()) {
            System.out.println("The long lasting thread is: " + thread1.getName());
        } else if (thread2.isAlive()) {
            System.out.println("The long lasting thread is: " + thread2.getName());
        } else if (thread3.isAlive()) {
            System.out.println("The long lasting thread is: " + thread3.getName());
        }
    }
}
