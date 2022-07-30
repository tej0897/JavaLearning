package testExamples.morningRevisionTIme;

public class C {

    public void m1(Object ... obj){
        System.out.println("Vargs Version");
    }






}

class P extends C{
    public void m1(String s){
        System.out.println("String");
    }
    public static void main(String[] args) {
        P c = new P();
        c. m1();    // throws an error cause we have not defined a constructor with zero arguments.
        c. m1(1,2);        // outputs: vargs version
        c. m1(123);       // outputs: object version
        c. m1("abc");    // outputs: string version
        c. m1(null);    //  outputs: string version
    }
}
