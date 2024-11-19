package OOPS.Threads;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(1000);  // Moves to TIMED WAITING
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread is finished.");
    }
}

public class ThreadLifecycle {
    public static void main(String[] args) {
        Thread t = new MyThread();  // NEW state
        System.out.println("Thread state: " + t.getState());

        t.start();  // RUNNABLE state
        System.out.println("Thread state: " + t.getState());

        try {
            Thread.sleep(500);  // Allow thread to run
            System.out.println("Thread state: " + t.getState());  // TIMED WAITING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            t.join();  // Wait for the thread to terminate
            System.out.println("Thread state: " + t.getState());  // TERMINATED
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
