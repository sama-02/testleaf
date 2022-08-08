package week3.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
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
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mohammed");//sends mohammed as input in local firstname
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Applications");//sends computer
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Description");//send the given keys to the description box
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf1@gmail.com");
		WebElement dropc = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd1=new Select(dropc);
		dd1.selectByVisibleText("New York");
		driver.findElement(By.className	("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("this is the important feild");
		driver.findElement(By.className("smallSubmit")).click();
		String title1="View Lead | opentaps CRM";//given title by the user
		String title2=driver.getTitle();//gets the title and assigns it to this variable
		//if(title1.equals(title2)){
		if (title1.contains(title2)){//if condition
			System.out.println("lead is created");//if the lead is created this will print
		}
		else {
			System.out.println("lead is not created");//if the lead is not created
	}
	}
	}
