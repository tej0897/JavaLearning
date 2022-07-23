package questionsPackage;

public class LazySingletonSyntax {
    private static LazySingletonSyntax instance;

    private LazySingletonSyntax(){
        //private constructor
    }

    public static LazySingletonSyntax getInstance() {
        if (instance == null){
            instance = new LazySingletonSyntax();
        }
        return instance;
    }
}
