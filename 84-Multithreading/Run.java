
public class Run {

    public static void main(String[] args) throws InterruptedException {

        // Multithreading - a process of executing multiple thread simultaneously.

        // Method 1: Extending Thread Class
        MyThread threadOne = new MyThread();

        // Method 2: Implementing Runnable Interface
        MyRunnable runnable = new MyRunnable();
        Thread threadTwo = new Thread(runnable);

        threadOne.start();
        threadOne.join(3000); // Second Thread will start after First Thread Finishes or after 3s
        threadTwo.start();
    }
}