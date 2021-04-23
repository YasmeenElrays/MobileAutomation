package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class LoginScreen extends PageBase{
    public LoginScreen(AppiumDriver driver) {
      super(driver);
    }
    @FindBy(id = "com.app.classera:id/edit_text_activity_login_username")
    MobileElement userName;
    @FindBy(id = "com.app.classera:id/edit_text_activity_login_password")
    MobileElement passWord;
    @FindBy(id="com.app.classera:id/button_activity_login_submit")
    MobileElement loginButton;


    public void Login() throws InterruptedException {
        Thread.sleep(4000);
        userName.sendKeys("ayas223");
        passWord.sendKeys("12sudo4");
        loginButton.click();

    }
}

