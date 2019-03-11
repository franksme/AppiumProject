package AppiumTestDemo;



import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class LongPressTest {
	
	//Instance of Appium DFriver
	AppiumDriver<WebElement> driver;
	
	
	@BeforeClass
	public class Setup throws MalformedURLException{
				
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "donatello");
		cap.setCapability(MobileCapabilityType.APP_ACTIVITY,
				"com.android.dialer.DialtactsActivity");
		cap.setCapability(MobileCapabilityType.APP_PACKAGE,
				"com.android.dialer");
		
		driver = new AndroidDriver<WebElement>(new URL(
				"http://127.0.0.1:4723/wd/hub"), cap);
	}
	
	@Test
	public void PressTest() {
		
		driver.findElementsById("com.android.dialer:id/zero");
		TouchAction zero = new TouchAction(driver);
		action.longPress(zero).perform();
		driver.quit();
		}
	
	}
	

}
