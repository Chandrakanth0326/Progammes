package handlinstaticcalender;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlectAnyMonthAndAnyDate {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		String monthAndTear="December 2022";
		int day=7;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		Actions action = new Actions(driver);
		action.moveByOffset(10, 10).click().perform();
		
		driver.findElement(By.className("langCardClose")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		for(;;) {
		try {
			driver.findElement(By.xpath("//div[text()='"+monthAndTear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+day+"']")).click();
			break;
		} catch (Exception e) {
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		}
		
	}
}
