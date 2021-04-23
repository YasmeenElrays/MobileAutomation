package Tests;

import Pages.LoginScreen;
import org.testng.annotations.Test;

public class LoginScreenTCs extends TestBase {
    @Test(alwaysRun = true)
    public static void UserLogin() throws InterruptedException {

        LoginScreen loginScreenObj=new LoginScreen(driver);
        loginScreenObj.Login();
    }
}
