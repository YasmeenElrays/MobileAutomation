package Tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.http.impl.BHttpConnectionBase;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public static AndroidDriver<MobileElement> driver;
    @BeforeTest(alwaysRun = true)

    public void OpenApplication() throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus6_API_30");
        caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\yasmeen\\Downloads\\app-staging-classera-debug.apk");
       driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),caps);

    }
}
