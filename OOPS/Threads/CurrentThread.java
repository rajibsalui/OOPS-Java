package OOPS.Threads;

class CurrentThread{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println("Current Thread : " + t);

        t.setName("My Thread");
        t.setPriority(7);
        System.out.println("After name change : " + t);

        try{
            for(int n=1;n<11;n++){
                System.out.println(n);
                Thread.sleep(3000);
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
    }
}
