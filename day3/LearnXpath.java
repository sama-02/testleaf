package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//sets up the path to chrome driver
		ChromeDriver driver= new ChromeDriver();//Opens/launches The chrome Browser
		driver.get("https://leafground.com/pages/Edit.html");//enters the link
		driver.manage().window().maximize();//maximize the window
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testleaf@gmail.com");//enters the email
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("Testleaf",Keys.TAB);//finds the input using the xpath and appends testleaf and presses tab
		String attribute=driver.findElement(By.xpath("//input[@name='username'][1]")).getAttribute("value");//retrives the value from the in the input and stores it in attribure
		System.out.println(attribute);//printes the attrubute
		WebElement clearance = driver.findElement(By.xpath("//input[@value='Clear me!!']"));//retrives the value inside the input and stores in clearance
		clearance.clear();//clears the input
		Boolean enabled=driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();//checks weather if the input is enabled or not.
		System.out.println(enabled);//prints the boolean value
	}

}
	