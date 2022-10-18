package mavendemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavendemo1 {
	public static String url ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver kiran;
	@BeforeTest
	public void BT()
	{
		WebDriverManager.chromedriver().setup();
		 kiran = new ChromeDriver();
		 kiran.get(url); 
	}//if
	@Test //windowhandle
	public void test9()  throws InterruptedException {
		kiran.getWindowHandle();
		//kiran.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
		//kiran.navigate().to(url);
		kiran.switchTo().newWindow(org.openqa.selenium.WindowType.WINDOW);
		kiran.
		
	}
	@Test  (enabled = false, priority = 1) //get links 
	public void test8() throws InterruptedException {
		List<WebElement> links= kiran.findElements(By.tagName("a"));
		System.out.print("total no links "+links.size());
		for(int i=0;i<links.size();i++)
		{
		
	   System.out.println(links.get(i).getText());
	   System.out.println(links.get(i).getAttribute("href"));

		}
	}
	
	@Test (enabled = false, priority = 1)
	public void test7() throws InterruptedException {
		WebElement user=kiran.findElement(By.name("username"));
		if(user.isEnabled())
		{
			user.sendKeys("Admin");
			Thread.sleep(3000);
		}
		
		WebElement pass=kiran.findElement(By.name("password"));
		if(pass.isDisplayed())
		{
		pass.sendKeys("admin123");
	    WebElement submit=kiran.findElement(By.xpath("//*[@type='submit']"));
		
		submit.click();
		Thread.sleep(3000);
		}
		
	}//login
	@Test
	public  void Test1() throws InterruptedException {
				
		Thread.sleep(3000);
		kiran.findElement(By.name("username")).sendKeys("Admin");
		kiran.findElement(By.name("password")).sendKeys("admin123");
		kiran.findElement(By.xpath("//*[@type='submit']")).click();
	}//del
	@Test (enabled = false, priority = 1)
	public  void Test4() throws InterruptedException {
		Thread.sleep(5000);
		kiran.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(5000);
		kiran.findElements(By.xpath("//*[@class='oxd-table-card']")).get(4).click();
		Thread.sleep(5000);
		kiran.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(4).click();
		Thread.sleep(5000);
		kiran.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(4).click();
		Thread.sleep(5000);
		kiran.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		Thread.sleep(5000);
	
				
		
	}//size and print assingment
	@Test(enabled=false,priority = 1)
    public void testcase2() throws InterruptedException
    {
    kiran.findElement(By.xpath("//*[text()='Admin']")).click();
    Thread.sleep(5000);
    
    List<WebElement>click=kiran.findElements(By.xpath("//*[@class='oxd-table-card']"));
    System.out.println("listsize " + click.size());
    Thread.sleep(5000);
     kiran.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).click();
     Thread.sleep(5000);
     System.out.println(kiran.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).getText());
     Thread.sleep(5000);
	 kiran.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(3).click();
   	 Thread.sleep(5000);
	 kiran.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		Thread.sleep(5000);
	
				
    }//action
	@Test (enabled = false, priority = 1)
	public void test5() throws InterruptedException{

		WebElement ele = kiran.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		Actions act = new Actions(kiran);
		act.click(ele).build().perform();
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		Thread.sleep(3000);
		act.sendKeys(ele,Keys.ENTER).click().build().perform();
		Thread.sleep(3000);
	}
	
	@Test (enabled = false, priority = 1)
	public  void Test2() throws InterruptedException {
		kiran.findElement(By.xpath("//*[@href='/web/index.php/maintenance/viewMaintenanceModule']")).click();
		kiran.findElement(By.name("password")).sendKeys("admin123");
		kiran.findElement(By.xpath("//*[@type='submit']")).click();
	}
	@Test  (enabled = false, priority = 2)
	public  void Test3() throws InterruptedException {
		kiran.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		Thread.sleep(2000);
		kiran.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
	
	}
	@AfterTest (enabled = false)
	public void AT()
	{
		kiran.close();
	}
}



