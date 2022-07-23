package questionsPackage;

public class SingletonExample {
    public static void main(String[] args) {
        SingletonEager instance = SingletonEager.getInstance();
        System.out.println(instance);
        SingletonEager instance1 = SingletonEager.getInstance();
        System.out.println(instance);
    }
    // to do
}

class SingletonEager{
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return instance;
    }
}

class Singleton{
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}