package questionsPackage;

public class StaticBlockSingletonSyntax {

    private static StaticBlockSingletonSyntax instance;

    private StaticBlockSingletonSyntax(){
        // private constructor
    }
    //static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingletonSyntax();
        } catch (Exception e){
            throw new RuntimeException("Exception occurred");
        }
    }

    public static StaticBlockSingletonSyntax getInstance() {
        return instance;
    }
}
