package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class PageBase {
    private final AppiumDriver driver;

    public JavascriptExecutor scroll;

    public PageBase (AppiumDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)),this);
    }


    public void ScrollDown() {
        scroll.executeScript("window.scrollBy(0,350)");
    }

    public void ScrollUp() {
        scroll.executeScript("window.scrollBy(0,-350)");
    }
}
