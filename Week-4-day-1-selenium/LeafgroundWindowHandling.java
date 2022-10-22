package week4day1selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundWindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("The size of the available windows : "+windowHandles.size());
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(2));
		System.out.println(driver.getTitle());
		driver.switchTo().window(window.get(1));
		driver.close();
		driver.switchTo().window(window.get(0));
		driver.close();
		

	}

}
