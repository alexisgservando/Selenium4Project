package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DevSkillerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://automationstepbystep.com");
		
		//TEST 1 
		WebElement div = driver.findElement(By.xpath("//div[contains(@class, 'container')]"));
		WebElement h1 = div.findElement(By.xpath(".//h1"));
		String header = h1.getText();
		System.out.println(header);

		//TEST 2
		WebElement button = driver.findElement(By.xpath("//button[text()='Click me!']"));
		button.click();
		WebElement link = driver.findElement(By.tagName("a"));
		String linkURL = link.getAttribute("href");
	    System.out.println(linkURL);

		//TEST 2 -> USE THIS ON THE AUTOMATION PAGE AND COMMENT TEST 1 AND TEST 2
		WebElement button2 = driver.findElement(By.linkText("YouTube"));
		String linkURL2 = button2.getAttribute("href");
		System.out.println(linkURL2);
		// button.click();

	}

}
