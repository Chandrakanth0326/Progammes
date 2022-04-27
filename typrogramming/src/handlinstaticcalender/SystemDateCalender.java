package handlinstaticcalender;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SystemDateCalender {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		LocalDateTime sysDate=LocalDateTime.now();
		int day = sysDate.getDayOfMonth();
		String month = sysDate.getMonth().toString();
		
		String actualMonth = month.substring(0,1)+month.substring(1).toLowerCase();
		int year = sysDate.getYear();
		String monthAndYear = actualMonth+" "+year;
		System.out.println(monthAndYear+" "+day);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		Actions action = new Actions(driver);
		action.moveByOffset(10, 10).click().perform();
		
		driver.findElement(By.className("langCardClose")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTUR']")).click();
		driver.findElement(By.xpath("//div[text()='"+monthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+day+"']")).click();
		
	}
}
