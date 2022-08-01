package week3.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadWithMandatoryFeilds {
	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();//chrome driver will be created
		driver.manage().window().maximize();//maximize the window
		driver.get("http://leaftaps.com/opentaps/control/main");//Enters the link in browser
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");//enters demosalesmanager in the username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//enters crmsfa in password
		driver.findElement(By.className("decorativeSubmit")).click();//clicks the submit button
		driver.findElement(By.linkText("CRM/SFA")).click();//clicks the crm/sfa button
		driver.findElement(By.linkText("Create Lead")).click();//clicks creat lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");//sends testleaf as company name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohammed");//sends mohammed as fiesr name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sama");//sends sama as last name
		driver.findElement(By.className	("smallSubmit")).click();//clicks the submit button
	}

}
