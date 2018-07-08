package com.Myobservatory.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myobservatory.qa.base.TestBase;

public class ExtraStationPage extends TestBase {

	@FindBy(id="hko.MyObservatory_v1_0:id/location")
	@CacheLookup
	public static WebElement location;
	
	@FindBy(id="hko.MyObservatory_v1_0:id/temperature")
	@CacheLookup
	public static WebElement temp;
	
	@FindBy(id="hko.MyObservatory_v1_0:id/rh")
	@CacheLookup
	public static WebElement rh;
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc = 'Add']")
	@CacheLookup
	private WebElement addlocation;
	
	@FindBy(xpath = "//android.widget.TextView[@content-desc = 'Refresh']")
	@CacheLookup
	private WebElement refresh;
	
	@FindBy(xpath = "//android.widget.ImageView[@content-desc = 'More options']")
	@CacheLookup
	private WebElement moreoptions;
	
	public ExtraStationPage() {
		PageFactory.initElements(driver, this);
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
	
	public ExtraStationPage refresh()
	{
		refresh.click();
		return new ExtraStationPage();
	}
}
