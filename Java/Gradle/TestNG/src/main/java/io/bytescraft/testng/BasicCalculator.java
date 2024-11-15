package io.bytescraft.testng;

/**
 * @author javaquery
 * @since 2024-11-07
 */
public class BasicCalculator {
    public BasicCalculator(){
        // Default constructor to identify the class initialization behaviour during parsing/execution
        System.out.println("BasicCalculator constructor");
    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        return a / b;
    }
}
