package handlinstaticcalender;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticCalander {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String date="4";
		String month="May";//dateCalender[];
		String year="2022";
		
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//step1: mavigate to fipkart
		driver.get("https://www.tripodeal.com/");
		//enter departure date
		driver.findElement(By.id("origin")).sendKeys("BLR");
		//select BLR in suggesstion
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='eac-item']/b[text()='BLR']")).click();
		//driver.findElement(By.xpath("//div[@class='eac-item']/b[text()='BLR']")).click();
		//enter destination
		driver.findElement(By.id("destination")).sendKeys("DEL");
		//select the destination
		//driver.findElement(By.xpath("//div[@class='eac-item']/b[text()='DEL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='eac-item']/b[text()='DEL']")).click();
		//select date feb 16 2022
		driver.findElement(By.id("dateNew")).click();
		int NoOfMonth=12;//11,10
		while(NoOfMonth>=0) {
		try {
		driver.findElement(By.xpath("//div[text()='February']"
				+ "/following-sibling::div[text()='2022']"
				+ "/ancestor::div[@class='picker__box']"
				+ "/descendant::div[text()='16']")).click();
		getDate();
		
		}
		catch (Exception e) {
			NoOfMonth--;
			Thread.sleep(3000);
			driver.findElement(By
					.xpath("//div[@title='Next month' and @aria-controls='dateNew_table']")).click();
		}
		
		}
		
	}
	public static String getDate() {
		SimpleDateFormat format=new SimpleDateFormat("dd MMMM yyyy");
		String date = format.format(new Date());
		return date;
	}

}
