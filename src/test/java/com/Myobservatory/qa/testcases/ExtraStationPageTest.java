/*package com.Myobservatory.qa.testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Myobservatory.qa.Util.TestUtil;
import com.Myobservatory.qa.base.TestBase;
import com.Myobservatory.qa.pages.HomePage;
import com.Myobservatory.qa.pages.stationlistPage;

import io.appium.java_client.TouchAction;

import com.Myobservatory.qa.pages.ExtraStationPage;

public class ExtraStationPageTest extends TestBase {

	HomePage HomePage;
	ExtraStationPage ExtraStationPage;
	SoftAssert softassert =  new SoftAssert();

	public ExtraStationPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		HomePage = new HomePage();
		stationlistPage = HomePage.;
	}
	
	@Test(priority=1)
	public void FirstnameTest() {
		log.info("testing firstname is mandatory r not");
		String compulsory = ContactPage.Firstname();
		Assert.assertEquals(compulsory, "true","firstname is optional");
	}

	@Test(priority=1,groups="content")
	public void validateExtrastationPage() {
		String location = ExtraStationPage.validatePlace();
		softassert.assertEquals(location, "Happy Valley","Mismatch in the location");
		String Temp = ExtraStationPage.validateTemp();
		softassert.assertEquals(Temp, "27.3°C","Mismatch in the Temperature");
		String RH = ExtraStationPage.validateRH();
		softassert.assertEquals(RH, "81%","Mismatch in the RH");
		softassert.assertAll();
	}
	
}
*/