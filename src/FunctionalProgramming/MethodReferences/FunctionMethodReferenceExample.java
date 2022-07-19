package FunctionalProgramming.MethodReferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();
    static Function<String, String> toUpperCaseMethodRef = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println("Using Lambda : " +toUpperCaseLambda.apply("hey man, what's up"));
        System.out.println("Using Method Reference : " +toUpperCaseMethodRef.apply("this is using Method Reference"));
    }
}
