package io.bytescraft.testng;

/**
 * @author javaquery
 * @since 2024-11-07
 */
public class ScientificCalculator {
    public double sqrt(int number) {
        double t;
        double sqrtroot = (double) number / 2;
        do {
            t = sqrtroot;
            sqrtroot = (t + (number / t)) / 2;
        }
        while ((t - sqrtroot) != 0);
        return sqrtroot;
    }

    public void throwAnException(){
        throw new RuntimeException("Exception check");
    }
}
