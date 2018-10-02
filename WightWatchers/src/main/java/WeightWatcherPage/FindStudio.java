package WeightWatcherPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base;

public class FindStudio extends Base {
  
	@FindBy(id = "meetingSearch")
	WebElement SearchBox;
	
	//@FindBy (css = "#ela-mfsr\\3a mf-find-btn")
	//WebElement EnterLocation;

    public FindStudio() {
	PageFactory.initElements(driver,this);
    }
    
    public String verifyFindStudioTitle() {
    	return driver.getTitle();
    }
    public void ClickOnSearchBox() {
    	SearchBox.sendKeys("10011"+ Keys.ENTER);
    	
    }
  //  public void Click() {
    //	EnterLocation.click();
    	
    }
    
    
    
    
