package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//sets up the chrome driver
		ChromeDriver driver= new ChromeDriver();//Opens The Browser
		driver.get("http://leaftaps.com/opentaps/control/main");//Enters the link in browser
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");//enters demosalesmanager in the username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//enters crmsfa in password
		driver.findElement(By.className("decorativeSubmit")).click();//clicks the submit button
		String text=driver.findElement(By.tagName("h2")).getText();//verifies the text is located
		System.out.println(text);//prints the text in console
	}

}
