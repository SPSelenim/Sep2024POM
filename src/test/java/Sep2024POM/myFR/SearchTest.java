package Sep2024POM.myFR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {
	
	public WebDriver driver=null;
	
	@BeforeClass
	public void init()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
	}
	
  @Test
  public void f() {
  try
  {
	  driver.manage().window().maximize();
	  searchPOM ss=new searchPOM(driver);
	  ss.sendFirstName("SS");
	  ss.sendLastName("PP");
	  ss.ClickQA();
	  System.out.println("DOOOOOOOOOOOOOOOOOOOONe");
  }
	  catch(Exception e)
  {
		  System.out.println( e.getMessage());
  }
  }
  
  @AfterClass
  public void tearDown()
  {
	  driver.quit();
  }
  
}
