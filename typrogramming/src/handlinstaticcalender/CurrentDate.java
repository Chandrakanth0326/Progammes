package handlinstaticcalender;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CurrentDate {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//step1: mavigate to fipkart
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='✕']")));
		driver.findElement(By.xpath("//button[.='✕']")).click();
		//navigate to travel
		driver.findElement(By.xpath("//div[text()='Travel']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='0-departcity']")).sendKeys("blr");
		driver.findElement(By.xpath("(//div[@class='_3uA4ax']/parent::div)[1]//span[.='Bengaluru']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='0-arrivalcity']")).sendKeys("del");
		driver.findElement(By.xpath("(//div[@class='_3uA4ax']/parent::div)[2]//span[.='New Delhi']")).click();
		
		driver.findElement(By.xpath("//input[@name='0-datefrom']")).click();
		driver.findElement(By.xpath("//div[@class='ZEl_b_ CeQnEq _2ogGYG _23xUYh _3pAV4E']"));
		driver.findElement(By.xpath("//div[contains(text(),'February 2022')]"));
		driver.findElement(By.xpath("(//button[text()='14'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='SEARCH']")).click();
	}
	public static String getDate() {
		SimpleDateFormat format=new SimpleDateFormat("dd MMMM yyyy");
		String date = format.format(new Date());
		return date;
	}


}
