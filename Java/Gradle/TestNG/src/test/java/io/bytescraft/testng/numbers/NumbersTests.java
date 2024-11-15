package io.bytescraft.testng.numbers;

import io.bytescraft.testng.Numbers;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author javaquery
 * @since 2024-11-07
 */
public class NumbersTests {
    @Test
    public void isOdd_test(){
        Assert.assertTrue(Numbers.isOdd(3));
    }
}
