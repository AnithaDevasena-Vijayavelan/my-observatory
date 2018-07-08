package com.Myobservatory.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase {

	
	//public static WebDriver driver;
	public static AppiumDriver<MobileElement> driver;
	public static Properties prop;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Applications/Eclipse/Amirtha/selenium/com.Appium.Myobservatory/src/main/java/com/Myobservatory"+"/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() throws MalformedURLException, InterruptedException{
		
        File appDir = new File("/Applications/Eclipse/selenium/Appium/myobservatory"); // path where apk is present
        File app = new File(appDir, prop.getProperty("package"));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability("deviceName", prop.getProperty("device_name"));
		  capabilities.setCapability(CapabilityType.BROWSER_NAME, prop.getProperty("browser"));
		  capabilities.setCapability(CapabilityType.VERSION, prop.getProperty("software_version"));
		  capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, prop.getProperty("automation_name"));
		  capabilities.setCapability("platformName", prop.getProperty("platform_name"));

		  capabilities.setCapability("appPackage", prop.getProperty("appPackage"));
		  capabilities.setCapability("appActivity", prop.getProperty("appActivity"));
		  
		  capabilities.setCapability("app", app.getAbsolutePath());
		  
		  driver = new AndroidDriver<MobileElement>(new URL(prop.getProperty("url")), capabilities);
		  driver.getCapabilities();
		  //driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		  //WebDriverWait wait=new WebDriverWait(driver, 30);
		  
		  /*driver.findElement(By.xpath("//android.widget.Button[@text = 'Agree']")).click();
		  driver.findElement(By.xpath("//android.widget.Button[@text = 'Agree']")).click();
		  
		  driver.findElement(By.xpath("//android.widget.Button[@text = 'ALLOW']")).click();
		  driver.findElement(By.id("hko.MyObservatory_v1_0:id/btn_friendly_reminder_skip")).click();*/
		  /*
		  driver.findElement(By.xpath("//android.widget.ImageButton[@index = '0' and  @content-desc = 'Navigate up']")).click();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);*/
		
		  /*
		  MobileElement list = driver.findElement(By.id("hko.MyObservatory_v1_0:id/left_drawer"));
	        MobileElement radioGroup = list
	                .findElement(MobileBy
	                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
	                        + "new UiSelector().text(\"Astro & Tide Info\"));"));
	        System.out.println(radioGroup.getLocation());
	        radioGroup.click();
	        */
		 
		  
	}
	

}
