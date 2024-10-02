package OOPS.Threads;

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread();
        t1.start();
        System.out.println("Main thread");

        t1.join();


	/*
		//requires the completion of child thread t1

	*/


        System.out.println("Output of the child thread");

//        ThreadGroup tg1 = new ThreadGroup();
//
//        Thread t1 = new Thread(tg1, "ThreadOne");
//        Thread t2 = new Thread(tg1, "ThreadTwo");
//        Thread t3 = new Thread(tg1, "ThreadThree");
    }
}
