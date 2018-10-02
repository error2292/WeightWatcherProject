package WeightWatcherPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class Homepage extends Base {
	@FindBy(xpath= "//*[@id=\"ww-logo-svg\"]")
	WebElement WWlogo;
	
	@FindBy(className = "find-a-meeting")
	WebElement findmeeting;
	
	public Homepage() {
		PageFactory.initElements(driver,this);
		
		
	}
public String VaildatehomepageTitle() {
	return driver.getTitle();
	
}
public boolean ValidateWWimage() {
	return WWlogo.isDisplayed();
	
	}
public FindStudio clickOnfindMeeting() {
	findmeeting.click();
	return new FindStudio();
}
}
