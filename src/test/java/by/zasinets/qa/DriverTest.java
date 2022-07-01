package by.zasinets.qa;

import org.junit.Assert;
import org.junit.Test;

public class DriverTest extends Base {

    @Test
    public void testTitle() {
        Assert.assertTrue(homePage.getTitle());
    }
}
