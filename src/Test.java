public class Test {
    public static void main(String[] args) {
        System.out.println(printResult());
    }

    public static String printResult(){
        String input = "91-044 56 9877 2976545";
        // Write your logic here
        input = input.replace(" ","");
        input = input.replace("-","");



        return input;

    }

}