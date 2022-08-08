package week3.day3.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//sets up chrome driver
		ChromeDriver driver=new ChromeDriver();//opens then browser
		driver.get("https://en-gb.facebook.com/");//opens the url
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicitly waits for a duration of 30 seconds
		driver.findElement(By.partialLinkText("Create")).click();//clicks the create new button
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mohammed");//send keys as mohammed in first name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sama");//send keys as sama in second name
		driver.findElement(By.xpath("(//input[@aria-required='true'])[3]")).sendKeys("998877665");//sends the numbers in the input feild
		driver.findElement(By.id("password_step_input")).sendKeys("12345678");//sends the numbers in the input feild
		WebElement drop1 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dd1=new Select(drop1);
		dd1.selectByVisibleText("22");//selects by visible text
		WebElement drop2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dd2 = new Select(drop2);
		dd2.selectByVisibleText("Mar");//selects by visible text
		WebElement drop3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dd3=new Select(drop3);
		dd3.selectByVisibleText("2002");//selects by visible text
		driver.findElement(By.xpath("//input[@value='2']")).click();//clicks the radio button as male
	}

}
