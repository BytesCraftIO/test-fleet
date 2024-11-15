package io.bytescraft.testng;

import org.testng.annotations.Test;

/**
 * @author javaquery
 * @since 2024-11-07
 */
public class ControlledExecutionTest {
    private ControlledExecution controlledExecution = new ControlledExecution();

    @Test(groups = {"FastTest"})
    public void sleep_10s(){
        controlledExecution.sleep(10);
    }

    @Test(groups = {"SlowTest"})
    public void sleep_20s(){
        controlledExecution.sleep(20);
    }

    @Test(groups = {"SlowTest"})
    public void sleep_30s(){
        controlledExecution.sleep(30);
    }
}
