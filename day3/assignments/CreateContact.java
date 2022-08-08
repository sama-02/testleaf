package week3.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//downloads the latest version of chrome and setup
		ChromeDriver driver=new ChromeDriver();//opens a chrome driver
		driver.manage().window().maximize();//maximize the window
		driver.get("http://leaftaps.com/opentaps/control/login");//loads the url
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");//enters demosalesmanager in the username
		driver.findElement(By.id("password")).sendKeys("crmsfa");//enters crmsfa in password
		driver.findElement(By.className("decorativeSubmit")).click();//clicks the submit button
		driver.findElement(By.linkText("CRM/SFA")).click();//clicks the crm/sfa button
		driver.findElement(By.linkText("Create Contact")).click();//clicks create contact button
		driver.findElement(By.id("firstNameField")).sendKeys("Mohammed");//sends mohammed in the first name feild
		driver.findElement(By.id("lastNameField")).sendKeys("Sama");//sends sama in second name feild
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mohammed");//sends mohammed in create local first name feild
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sama");//sends sama in create contact feild
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("BCA");//sends BCA in create department name feild
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is description");//sends the words in create description feild
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Testleaf@gmail.com");//sends the words in create email feild
		WebElement drop1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));//creates a variable as drop1
		Select dd1=new Select(drop1);//
		dd1.selectByVisibleText("New York");//selects by visible text
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();//clicks the submit button
		driver.findElement(By.linkText("Edit")).click();//clicks the edit button
		driver.findElement(By.id("updateContactForm_description")).clear();//clicks the clear button
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This is important note");//sends the input to the box
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();//clicks the submit button
		String title=driver.getTitle();//gets the title
		System.out.println(title);//print the title on the console
	}

}
