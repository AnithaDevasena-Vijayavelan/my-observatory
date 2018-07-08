package com.Myobservatory.qa.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myobservatory.qa.base.TestBase;

import io.appium.java_client.TouchAction;


public class HomePage extends TestBase {

	@FindBy(className="android.widget.ImageButton")
	public static WebElement menuIcon;
	
	public static String DayForcast = "HK 9-Day Forecast";
	@FindBy(id="hko.MyObservatory_v1_0:id/text")
	public static WebElement dayForcase_Link;
	
	@FindBy(id="hko.MyObservatory_v1_0:id/date")
	@CacheLookup
	public static  WebElement Day_Date;
	
	@FindBy(id="hko.MyObservatory_v1_0:id/location")
	@CacheLookup
	public static WebElement location;
	
	@FindBy(id="hko.MyObservatory_v1_0:id/temperature")
	@CacheLookup
	public static WebElement temp;
	
	@FindBy(id="hko.MyObservatory_v1_0:id/rh")
	@CacheLookup
	public static WebElement rh;
	
	@FindBy(xpath = "//android.widget.TextView[@index = '0' and  @content-desc = 'Add']")
	@CacheLookup
	private WebElement addlocation;
	
	@FindBy(xpath = "//android.widget.TextView[@index = '1' and  @content-desc = 'Refresh']")
	@CacheLookup
	private WebElement refresh;
	
	@FindBy(xpath = "//android.widget.ImageView[@index = '2' and  @content-desc = 'More options']")
	@CacheLookup
	private WebElement moreoptions;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateDate_Day()
	{
		return Day_Date.getText();
	}
	
	public String validatePlace()
	{
		return location.getText();
	}
	
	public String validateTemp()
	{
		return temp.getText();
	}
	
	public String validateRH()
	{
		return rh.getText();
	}
	
	
	public stationlistPage addLocation()
	{
		addlocation.click();
		return new stationlistPage();
	}
	
	public HomePage refresh()
	{
		refresh.click();
		return new HomePage();
	}
	
	public NineDayforecastPage daysforecast() throws InterruptedException{
		TouchAction act=new TouchAction(driver);
		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.height * 0.5);
		int startPoint = (int) (size.width * 0.9);
		int endPoint = (int) (size.width * 0.01);
		// new TouchAction(driver).press(startPoint, anchor).waitAction(duration).moveTo(endPoint, anchor).release().perform();
		act.press(startPoint, anchor).moveTo(endPoint, anchor).release().perform();
		  return new NineDayforecastPage();
	}
}
