import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author javaquery
 * @since 2024-11-07
 */
public class DefaultPackageTestFile {
    @Test
    public void default_package_add_test(){
        System.out.println("This is default package test file.");
        Assert.assertEquals(4, 2 + 2);
    }
}
