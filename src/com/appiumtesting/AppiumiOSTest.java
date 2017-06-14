package com.appiumtesting;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.remote.DesiredCapabilities;
 
import io.appium.java_client.remote.HideKeyboardStrategy;
 
import io.appium.java_client.AppiumDriver;
 
import io.appium.java_client.MobileElement;
 
import io.appium.java_client.remote.MobileCapabilityType;
 
import io.appium.java_client.service.local.AppiumDriverLocalService;
 
import org.junit.*;
 
import java.net.URL;
 
import org.openqa.selenium.Point;
 
import org.openqa.selenium.ScreenOrientation;
 
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.html5.Location;

public class AppiumiOSTest {
	
	private IOSDriver driver;
@Before
	public void setUp() throws MalformedURLException {
		 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "9.3");
		capabilities.setCapability("deviceName", "iPhone 6");
		capabilities.setCapability("app", "/Users/hamzajerbi/Desktop/Work/AppiumNew/AppiumTestApp/platforms/ios/build/emulator/AppiumTestApp.app"); 
		driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		 
		}
	@Test
	public void testiOS() throws InterruptedException {
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[1]")).click();
		 
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIALink[2]/UIAStaticText[1]")).click();
		 
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[1]")).sendKeys("eVeris");
		 
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIATextField[2]")).sendKeys("test");
		 
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAToolbar[1]/UIAButton[3]")).click();
		 
		driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAButton[2]")).click();
		 
		String text = driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAWebView[1]/UIAStaticText[5]")).getText();
		 
		Assert.assertEquals(text, "Everis Test", text);
		 
		}
		 
		@After
		 
		public void tearDown() {
		 
		driver.quit();
		 
		}
	
	
}
