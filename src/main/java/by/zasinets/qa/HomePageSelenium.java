package by.zasinets.qa;

import org.openqa.selenium.WebDriver;

public class HomePageSelenium {
    private final WebDriver driver;

    public HomePageSelenium(WebDriver driver) {
        this.driver = driver;
    }

    public boolean getTitle() {
        return driver.getTitle().endsWith("EvilTester.com");
    }
}
