package com.Myobservatory.qa.testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Myobservatory.qa.Util.TestUtil;
import com.Myobservatory.qa.base.TestBase;
import com.Myobservatory.qa.pages.ExtraStationPage;
import com.Myobservatory.qa.pages.HomePage;
import com.Myobservatory.qa.pages.stationlistPage;


public class StationListPageTest extends TestBase{
	HomePage HomePage;
	stationlistPage stationlistPage;
	ExtraStationPage ExtraStationPage;

	public StationListPageTest(){
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
		  stationlistPage = HomePage.addLocation();
	}

	
	@Test(priority=5,groups="addotherlocation and verfication")
	public void validatextrastation() {
		String extrastation = stationlistPage.addstation();
		Assert.assertEquals(extrastation, "Happy Valley","No match in location");
	}
	
	/*@Test(priority=2,groups="extrastationpage")
	public void extrastationpage() throws InterruptedException {
		ExtraStationPage = stationlistPage.extrastationpage();
	}*/
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	
}
