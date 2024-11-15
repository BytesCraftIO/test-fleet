package io.bytescraft.testng;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author javaquery
 * @since 2024-11-07
 */
public class ControlledExecution {
    private final Logger logger = Logger.getLogger(ControlledExecution.class.getName());

    public void sleep(int seconds){
        try {
            logger.info("sleep for " + seconds + " seconds");
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
