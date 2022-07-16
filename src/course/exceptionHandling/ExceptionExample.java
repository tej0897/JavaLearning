package course.exceptionHandling;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (NumberFormatException e){
            System.out.println("Please enter valid input");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter numbers between 1 and 4");
        } catch (Exception e){
            System.out.println("Something went wrong");
        }
    }

    public static void doSomething() throws ArrayIndexOutOfBoundsException, NumberFormatException{
        int userChoice = Integer.parseInt("0");
        String [] fruits = {"Apple","Banana", "Mangoes", "Oranges"};
        System.out.println("User chose the fruit : " +fruits[userChoice-1]);
    }
}
