package io.bytescraft.testng.failed;

import io.bytescraft.testng.BasicCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

/**
 * @author javaquery
 * @since 2024-11-07
 */
public class FailingTests {
    private final Logger logger = Logger.getLogger(FailingTests.class.getName());

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test(enabled = false)
    public void fail_add_test(){
        logger.info("FailingTests#fail_add_test" + " {failing this test case explicitly}");
        Assert.assertEquals(8, basicCalculator.add(2, 2));
    }
}
