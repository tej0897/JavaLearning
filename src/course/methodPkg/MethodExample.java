package course.methodPkg;

public class MethodExample {
    public static void main(String[] args) {
        MethodExample obj = new MethodExample();
        System.out.println(obj.avgCalc(2,3,4));
    }

    public double avgCalc(int a, int b, int c){
        return (double) (a + b + c)/ 3;
    }
}
