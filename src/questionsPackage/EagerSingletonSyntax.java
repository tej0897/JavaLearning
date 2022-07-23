package questionsPackage;

public class EagerSingletonSyntax {
    private static EagerSingletonSyntax instance = new EagerSingletonSyntax();

    // Private constructor
    private EagerSingletonSyntax(){

    }

    public static EagerSingletonSyntax getInstance() {
        return instance;
    }
}



