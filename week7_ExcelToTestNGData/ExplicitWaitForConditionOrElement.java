package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitForConditionOrElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/waits.xhtml");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		
		
		  driver.findElement(By.xpath("//span[text()='Click']")).click(); 
		  WebElement element1 = driver.findElement(By.xpath("//span[text()='I am here']"));
		  if(wait.until(ExpectedConditions.visibilityOf(element1)) != null) 
		  {
		  System.out.println("The element is visible"); 
		  }else {
		  System.out.println("THe element is not visible"); }
		  
		  
		  WebElement clickElement = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
		  clickElement.click(); 
		  WebElement hidden = driver.findElement(By.xpath("//span[text()='I am about to hide']/parent::button")); 
		  Boolean until = wait.until(ExpectedConditions.invisibilityOf(hidden)); 
		  if(until==true) {
		  System.out.println("The element is not visible"); 
		  }else {
		  System.out.println("THe element is visible"); 
		  }
		  
		  
		  driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		  WebElement clickable = driver.findElement(By.xpath("//span[text()='Click Second']"));
		  wait.until(ExpectedConditions.elementToBeClickable(clickable)); 
		  String text1 = clickable.getText(); 
		  System.out.println(text1);
		 
		
		
		
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		WebElement textChangeButton = driver.findElement(By.xpath("//span[text()='Did you notice?']"));
		String text = textChangeButton.getText();
		Boolean until2 = wait.until(ExpectedConditions.textToBePresentInElement(textChangeButton, text));
	    if(until2=true) { 
	    	System.out.println("Text changed");
		}else {
		  System.out.println("nothing changed"); 
		}
		 
		

		
	}

}
