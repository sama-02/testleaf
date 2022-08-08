package week3.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeads {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();//chrome driver will be created
		driver.manage().window().maximize();//maximize the window
		driver.get("http://leaftaps.com/opentaps/control/main");//Enters the link in browser
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");//enters demosalesmanager in the username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//enters crmsfa in password
		driver.findElement(By.className("decorativeSubmit")).click();//clicks the submit button
		driver.findElement(By.linkText("CRM/SFA")).click();//clicks the crm/sfa button
		driver.findElement(By.linkText("Leads")).click();//clicks the lead button
		driver.findElement(By.linkText("Find Leads")).click();//click find leads buttons
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Mohammed");//send keys as mohammed in firstname
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();//clicks the button
		Thread.sleep(2000);//waits for 2000 milliseconds
		driver.findElement(By.linkText("16920")).click();//clicks the first element i.e 16920
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();//clicks submit button
		WebElement se1 = driver.findElement(By.id("updateLeadForm_companyName"));//creates a web element as se1
		se1.clear();//clears the webelement
		se1.sendKeys("TestingLeaf");//send keys as testing leaf to that element
		driver.findElement(By.xpath("//input[@value='Update']")).click();//clicks the update button
		driver.findElement(By.linkText("Find Leads")).click();//clicks the find lead buttom
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Mohammed");//sends the new input as mohammed
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();//clicks the update button
		driver.close();	//closes the driver
	}

}
