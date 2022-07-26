package testExamples.CodingWithJohn;

public class BlockingFinally {
    public static void main(String[] args) {
        try{
            float answer = 10 / 2;
            System.out.println(answer);
            System.exit(0);

        } catch (ArithmeticException AE){
            System.out.println("Please check the inputs");
            System.exit(0);
        }
        finally {
            System.out.println("this is finally statement");
        }
    }
}
