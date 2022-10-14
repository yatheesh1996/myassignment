package week1day2selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAss5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.navigate().back();
		System.out.println(driver.findElement(By.linkText("Find the URL without clicking me.")).getAttribute("href"));
		driver.findElement(By.linkText("Broken?")).click();
		String title= driver.getTitle();
		if(title.contains("Error")) {
			System.out.println("it is broken page");
		}else {
			System.out.println("it is not a broken page");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[2]")).click();
		driver.navigate().back();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("the count of links in the page : "+links.size());
		driver.findElement(By.linkText("How many links in this layout?")).click();
		List<WebElement> layoutLinks = driver.findElements(By.tagName("a"));
		System.out.println("the count of Layout links in the page : "+layoutLinks.size());
		driver.navigate().back();
		
		
		
		
		

	}

}
