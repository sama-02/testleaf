package week5.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();//chrome driver will be created
		driver.manage().window().maximize();//maximize the window
		driver.get("https://leafground.com/alert.xhtml");//Enters the link in browser
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
		Thread.sleep(3000);
		Alert simpleAlert=driver.switchTo().alert();
		simpleAlert.accept();
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]")).click();
		Alert confirmAlert=driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert.dismiss();
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]")).click();
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		promptAlert.sendKeys("testleaf");
		Thread.sleep(3000);
		promptAlert.accept();
		Thread.sleep(3000);
		//sweetalert=inspectable
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]/div[1]/a")).click();
		Thread.sleep(3000);
		
	}

}
