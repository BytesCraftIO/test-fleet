package io.bytescraft.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

/**
 * @author javaquery
 * @since 2024-11-07
 */
public class ScientificCalculatorTests {
    private final Logger logger = Logger.getLogger(ScientificCalculatorTests.class.getName());
    ScientificCalculator scientificCalculator = new ScientificCalculator();

    @Test
    public void sqrt_test(){
        logger.info("ScientificCalculatorTests#sqrt_test");
        String actual = System.getProperty("sqrt");
        if (actual != null) {
            Assert.assertEquals(Double.parseDouble(actual), scientificCalculator.sqrt(4), 0);
        }else{
            Assert.assertEquals(2.0D, scientificCalculator.sqrt(4), 0);
        }
    }

    @Test
    public void throwAnException_test(){
        Assert.assertThrows(RuntimeException.class, () -> scientificCalculator.throwAnException());
    }
}
