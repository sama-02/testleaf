package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearingDefaultCharacters {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/pages/Edit.html");
		WebElement clearance = driver.findElement(By.xpath("//input[@value=\"Clear me!!\"]"));
		clearance.clear();
	}

}
