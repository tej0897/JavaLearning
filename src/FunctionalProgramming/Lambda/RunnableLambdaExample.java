package FunctionalProgramming.Lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Runnable newRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Run Method! using Legacy Method ");
            }
        };
        new Thread(newRunnable).start();

        Runnable LambdaRunnable1 = () -> {
            System.out.println("Inside Run Method! using Lambda Method 1");

        };
        new Thread(LambdaRunnable1).start();

        // ignore braces if we use single line command in Lambda:

        Runnable LambdaRunnable2 = () -> System.out.println("Inside Run Method! using Lambda Method 2");
        new Thread(LambdaRunnable2).start();

        // passing the code directly to thread without Variable:

        new Thread(() -> System.out.println("Inside Run Method! using Thread Method 3")).start();
    }
}
