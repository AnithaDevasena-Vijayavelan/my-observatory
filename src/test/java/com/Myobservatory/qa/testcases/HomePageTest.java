package com.Myobservatory.qa.testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Myobservatory.qa.Util.TestUtil;
import com.Myobservatory.qa.base.TestBase;
import com.Myobservatory.qa.pages.HomePage;
import com.Myobservatory.qa.pages.NineDayforecastPage;
import com.Myobservatory.qa.pages.stationlistPage;


public class HomePageTest extends TestBase {
	
	HomePage HomePage;
	NineDayforecastPage NineDayforecastPage;
	stationlistPage stationlistPage;
	SoftAssert softassert =  new SoftAssert();

	public HomePageTest(){
		super();
	}
	

	@BeforeMethod
	public void setup() throws MalformedURLException, InterruptedException {
		initialization();
		driver.findElement(By.xpath("//android.widget.Button[@text = 'Agree']")).click();
		  driver.findElement(By.xpath("//android.widget.Button[@text = 'Agree']")).click();
		  driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	 driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		  driver.findElement(By.id("hko.MyObservatory_v1_0:id/btn_friendly_reminder_skip")).click();
		  HomePage = new HomePage();
	}

	/*@Test(priority=1,groups="content")
	public void validateHomePagecontent() {
		String Date_Day = HomePage.validateDate_Day();
		softassert.assertEquals(Date_Day, "09 May 2018 (Wednesday)","No match in Date and day");
		String location = HomePage.validatePlace();
		softassert.assertEquals(location, "Chi Fu","Mismatch in the location");
		String Temp = HomePage.validateTemp();
		softassert.assertEquals(Temp, "24.3°C","Mismatch in the Temperature");
		String RH = HomePage.validateRH();
		softassert.assertEquals(RH, "94%","Mismatch in the RH");
		softassert.assertAll();
	}
	
	@Test(priority=2,groups="addotherlocation")
	public void addextrastation() {
		 stationlistPage = HomePage.addLocation();
	}
	
	@Test(priority=3,groups="refresh")
	public void Reload() {
		 HomePage = HomePage.refresh();
	}*/
	
	@Test(priority=1,groups="daysforecast")
	public void daysforecast() throws InterruptedException {
		NineDayforecastPage = HomePage.daysforecast();
	}
	
//	@Test(priority=2,groups="content")
//	public void validateLocation() {
//		String Date_Day = HomePage.validatePlace();
//		Assert.assertEquals(Date_Day, "Chi Fu","Mismatch in the location");
//	}
//	
//	@Test(priority=3,groups="content")
//	public void validateTemperature() {
//		String Date_Day = HomePage.validateTemp();
//		Assert.assertEquals(Date_Day, "23.6°C","Mismatch in the Temperature");
//	}
//	
//	@Test(priority=4,groups="content")
//	public void validateRelhumidity() {
//		String Date_Day = HomePage.validateRH();
//		Assert.assertEquals(Date_Day, "81%","Mismatch in the RH");
//	}
	/*@AfterMethod
	public void tearDown() {
//		driver.close();
	driver.quit();
	}*/

	
}
