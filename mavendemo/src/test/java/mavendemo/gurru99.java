package mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gurru99 {
	public static String url = "https://demo.guru99.com/test/newtours/";
		WebDriver sai;

		@BeforeTest
		public void BT()
		{
			WebDriverManager.chromedriver().setup();
			sai = new ChromeDriver();
			//sai.get(url);
			sai.navigate().to(url);
			
		}
		
		@Test
		public void test1() throws InterruptedException {
			sai.findElement(By.name("userName")).sendKeys("user");
			sai.findElement(By.name("password")).sendKeys("user");
			sai.findElement(By.xpath("//*[@type='submit']")).click();
			
			sai.findElement(By.linkText("REGISTER")).click();
			sai.navigate().back();
			sai.navigate().refresh();
			sai.navigate().forward();
			
		}		
			
		@Test (priority =0,enabled =true)
		public void test2() throws InterruptedException{
			sai.findElement(By.name("firstName")).sendKeys("kiran");
			sai.findElement(By.name("firstName")).sendKeys("sai");
			sai.findElement(By.name("lastName")).sendKeys("busa");
			sai.findElement(By.name("phone")).sendKeys("7097919992");
			
			sai.findElement(By.name("userName")).sendKeys("saikiranbusa@gmail.com");
			sai.findElement(By.name("city")).sendKeys("hyderabad");
			sai.findElement(By.name("state")).sendKeys("telangana");
			sai.findElement(By.name("postalCode")).sendKeys("503001");
			
			Thread.sleep(5000);
			//WebElement click = sai.findElement(By.xpath()
			Select s= new Select (sai.findElement(By.name("country")));
			//s.selectByIndex(4);
			s.selectByValue("ARUBA");
			Thread.sleep(3000);
			WebElement name = sai.findElement(By.name("email"));
			name.sendKeys("saikiran");
//			sai.findElement(By.name("email")).sendKeys("saikiran");
			sai.findElement(By.name("password")).sendKeys("kiran2515");
			sai.findElement(By.name("confirmPassword")).sendKeys("kiran2515");
			String cu = sai.getCurrentUrl();
			System.out.println(cu);
		    String afterlogin= sai.getTitle();
	      	System.out.println(afterlogin);
			
			
			
		}
		@AfterTest
		public void AT() {
			sai.close();
		}
}
//kiran.findElements(By.xpath("//[@class='oxd-table-card']")).get(12).click();
//Thread.sleep(5000);
//kiran.findElements(By.xpath("//*[@class= 'oxd-icon bu-check oxd-checkbox-input-icon']")).get(12).click();
//Thread.sleep(5000);
//kiran.findElements(By.xpath("//*[class='oxd-icon bi-trash']")).get(12).click();
//Thread.sleep(5000);
//kiran.findElement(By.xpath("//*[@class='oxd-button oxd-butto--medium oxd-button--label-danger orangehrm-button-margin']")).click();
//Thread.sleep(5000);

