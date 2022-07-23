package questionsPackage;

public class ThreadSafeSingletonSyntax {
    private static ThreadSafeSingletonSyntax instance;

    private ThreadSafeSingletonSyntax(){
        // private constructor
    }

    public static synchronized ThreadSafeSingletonSyntax getInstance() {
        if (instance == null){
            instance = new ThreadSafeSingletonSyntax();
        }
        return instance;
    }
}
