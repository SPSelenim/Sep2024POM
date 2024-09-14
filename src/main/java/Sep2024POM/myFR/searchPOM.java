package Sep2024POM.myFR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class searchPOM {

	public WebDriver driver = null;

	public String myFirst = "fname";
	public String myLast = "lname";
	public String myQA = "//a[@name='QA']";

	public searchPOM(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName()
	{
		WebElement f=null;
		f=driver.findElement(By.id(myFirst));
		return f;
	}
	
	public WebElement getLastName()
	{
		WebElement f=null;
		f=driver.findElement(By.id(myLast));
		return f;
	}
	
	public WebElement getQA()
	{
		WebElement f=null;
		f=driver.findElement(By.xpath(myQA));
		return f;
	}
	
	public void sendFirstName(String myF)
	{
		try
		{
			Thread.sleep(2000);
			getFirstName().sendKeys(myF);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public void sendLastName(String myL)
	{
		try
		{
			Thread.sleep(2000);
	getLastName().sendKeys(myL);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void ClickQA()
	{
		try
		{
	getQA().click();
	Thread.sleep(2000);
	}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
}
