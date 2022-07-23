package questionsPackage;

public class ThreadSafeSingletonExample2 {
    private static ThreadSafeSingletonExample2 instance;

    private ThreadSafeSingletonExample2(){
        // private constructor
    }

    public static ThreadSafeSingletonExample2 getInstance() {
        if (instance==null){
            synchronized (ThreadSafeSingletonExample2.class){
                instance = new ThreadSafeSingletonExample2();
            }
        }
        return instance;
    }
}
