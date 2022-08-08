package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//sets up the path to chrome driver
		ChromeDriver driver= new ChromeDriver();//Opens/launches The chrome Browser
		driver.get("http://www.leafground.com/pages/Dropdown.html");//loads the url
		driver.manage().window().maximize();
		WebElement drop1 = driver.findElement(By.id("dropdown1"));
		Select dd1=new Select(drop1);
		dd1.selectByVisibleText("Appium");
		WebElement drop3 = driver.findElement(By.id("dropdown3"));
		Select dd3=new Select(drop3);
		dd3.selectByValue("2");
	}

}
