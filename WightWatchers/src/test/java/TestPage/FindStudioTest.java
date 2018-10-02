package TestPage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;
import WeightWatcherPage.FindStudio;
import WeightWatcherPage.Homepage;

public class FindStudioTest extends Base {
	Homepage hp;
	FindStudio find;
	
	public FindStudioTest() {
		super();
	}
	@BeforeMethod
	public void initialization() {
		SetUp();
	 hp = new Homepage();
	 find= hp.clickOnfindMeeting();

	}
	
	@Test (priority = 1)
	public void verifyFindStudioTitle() {
		String findStudioTitle = find.verifyFindStudioTitle();
		Assert.assertEquals(findStudioTitle, "Find a Studio & Meeting Near You |WW USA","Find studio title not matched");
		
	}
  @Test(priority = 2)
  public void clickOnSearchBox() {
	find.ClickOnSearchBox();
}
/*@Test (priority = 3)
public void click() {
	find.Click();
}*/
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	}


