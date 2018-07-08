package com.Myobservatory.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Myobservatory.qa.Util.TestUtil;
import com.Myobservatory.qa.base.TestBase;


public class stationlistPage extends TestBase{
	
	public stationlistPage() {
		PageFactory.initElements(driver, this);
	}


	
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'hko.MyObservatory_v1_0:id/text') and @text='Happy Valley']")
	@CacheLookup
	public static  WebElement hapyvalley;
	
	@FindBy(xpath = "//android.widget.TextView[contains(@resource-id,'android:id/title') and @text='EDIT']")
	@CacheLookup
	public static  WebElement editBtn;
	
	@FindBy(id = "hko.MyObservatory_v1_0:id/text")
	@CacheLookup
	public static  WebElement station1;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	@CacheLookup
	public static  WebElement moveBack;
	
	
	public String addstation()
	{
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		//addlocation.click();
		hapyvalley.click();
		editBtn.click();
		return station1.getText();
	}

}
