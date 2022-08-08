package week3.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();//chrome driver will be created
		driver.manage().window().maximize();//maximize the window
		driver.get("http://leaftaps.com/opentaps/control/main");//Enters the link in browser
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");//enters demosalesmanager in the username
		Thread.sleep(2000);//slows down the automation by 2000 milliseconds
		driver.findElement(By.id("password")).sendKeys("crmsfa");//enters crmsfa in password
		Thread.sleep(2000);//slows down the automation by 2000 milliseconds
		driver.findElement(By.className("decorativeSubmit")).click();//clicks the submit button
		Thread.sleep(2000);//slows down the automation by 2000 milliseconds

	}

}
