package AppiumTestDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTestChrome {

	
@Test 

public void Androidtest() throws MalformedURLException {
	
//Create object of DesiredCapabilities class and specify Android platform
DesiredCapabilities capabilities=DesiredCapabilities.android();

//Set the capability to execute test in Chrome browser
capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, BrowserType.CHROME);

//Set the capability to execute test in Android platform
capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);

//Define platform name
capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");

//Set the device name
capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "My Android Phone");

//Set Android version
capabilities.setCapability(MobileCapabilityType.VERSION, "5.1.1");

//Create an object of URL class and specify the Appium address
URL url=new URL("http://127.0.0.1:4723/wd/hub");

//Create an object of AndroidDriver class and pass the url and capability
WebDriver driver=new AndroidDriver(url, capabilities);

//Open url
driver.get("http://www.facebook.com");

//Enter Username
driver.findElement(By.name("email").sendKeys("johndoe@gmail.com")));

//Enter Password
driver.findElement(By.name("pass").sendKeys("johndoe")));

//Click "Submit" button
driver.findElement(By.id("u_0_5").click();

Thread.sleep(5000);

//Close the browser
driver.quit();


//Print the title
System.out.println("Title "+driver.getTitle());

//








	
}


}
