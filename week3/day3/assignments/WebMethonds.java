package week3.day3.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebMethonds {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");//goes into the url
		driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt90\']")).click();
		System.out.println(driver.getTitle());//prints the title
		driver.get("https://www.leafground.com/button.xhtml");//goes into the url
		System.out.println(driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]")).getLocation());//gets the location of the attribute
		System.out.println(driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span")).getCssValue("background-color"));//gets the cssvalue
		System.out.println(driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt102:imageBtn\"]")).getSize());//gets the size
		driver.get("https://www.leafground.com/link.xhtml");//goes into the url
		System.out.println(driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[2]/div/div/a")).getAttribute("href"));//prints the href attribute
		driver.get("https://www.leafground.com/checkbox.xhtml");//goes into the url
		System.out.println(driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]")).isSelected());//checks weather the checkbox is enabled or not
		driver.close();//closes the driver
	}

}
