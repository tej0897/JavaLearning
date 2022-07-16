package course.flowControlPkg;

public class FlowControl {
    public static void main(String[] args) {
        System.out.println(printResult());
    }

    public static String printResult(){
        // Write your logic here to return expected patter as string
        String finalStr = "";
        for(int i = 1; i < 11; i++){
            finalStr = finalStr + "2 * " + i + " = " + (i*2) + ("\n");
            }
        return finalStr;
    }


}
