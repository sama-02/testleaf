package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsGrandparentGrandchildXpath {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("hello");//parent to child xpath
			driver.findElement(By.xpath("//form[@id='login']//input[@id='password']")).sendKeys("hello");//grand parent to grand child
			driver.findElement(By.xpath("//form[@id='login']//input[@class='decorativeSubmit']")).click();//grand parent to grand child
	}

}
