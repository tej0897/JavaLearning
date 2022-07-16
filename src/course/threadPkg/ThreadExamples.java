package course.threadPkg;



    /*

    Thread creation via Extending the java.lang.Thread class


    public class ThreadExamples extends Thread{
    @Override
    public void run() {
        for (int i=0; i<3; i++){
            System.out.println("i Value is :: "+i);
        }
    }

    public static void main(String[] args) {
        ThreadExamples test = new ThreadExamples();
        test.start();
    }
}
     */



    // Thread creation using Runnable Interface.


public class ThreadExamples implements Runnable{
    @Override
    public void run() {

            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("The Current Thread is " + Thread.currentThread().getName() + ", the value if i is :: " + i);
            }

    }

    public static void main(String[] args) {
        ThreadExamples obj = new ThreadExamples();
        Thread t1 = new Thread(obj);
        t1.setName("Thread 1");
        Thread t2 = new Thread(obj);
        t2.setName("Thread 2");
        Thread t3 = new Thread(obj);
        t3.setName("Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}

