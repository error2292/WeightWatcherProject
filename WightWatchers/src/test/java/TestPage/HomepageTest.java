package TestPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import WeightWatcherPage.FindStudio;
import WeightWatcherPage.Homepage;

public class HomepageTest extends Base{
	Homepage hp;
	FindStudio find;
	public HomepageTest() {
		super ();
	}
	
	@BeforeMethod
	public void initialization() {
		SetUp();
	 hp = new Homepage();
		
	}
	
@ Test
    public void HomepagetitleTest() {
	String title = hp.VaildatehomepageTitle();
	Assert.assertEquals(title,"WW (Weight Watchers): Weight Loss & Wellness Help" );
	
}
@Test
public void logotest() {
	boolean logo = hp.ValidateWWimage();
	Assert.assertTrue(logo);
}
@Test
public void FindMeeting() {
	hp.clickOnfindMeeting();
}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
