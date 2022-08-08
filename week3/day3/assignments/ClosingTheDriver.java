package week3.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClosingTheDriver {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title1=driver.getTitle();//gets the title and assigns it to this variable
		//if(title1.equals(title2)){
		System.out.println(title1);//prints the title in console
		driver.findElement(By.partialLinkText("Log")).click();//clicks the login button
		driver.close();//closes the driver
}
}		