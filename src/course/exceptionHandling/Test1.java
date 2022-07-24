package course.exceptionHandling;


public class Test1 {
    public static void main(String[] args) {
        int test = test();
        System.out.println(test);
    }

    private static int test() {
       try {
           int i = 10/0;
           return 3;

       }
       catch (ArithmeticException e){
           System.out.println("AE");
           return 8;
       }
       catch (NumberFormatException e){
           return 9;
       }
       finally {
          return 10;
       }
       //return 12;
    }
}
