package Base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static  WebDriver driver;
	
	public static Properties prop; 
	
	public Base() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("E:\\E23300509\\WightWatchers\\src\\main\\java\\readFile\\Config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void SetUp() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver" , "C:\\Program Files\\SeleniumTool\\chromedriver.exe");
                driver = new ChromeDriver();
		}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
	}
}


