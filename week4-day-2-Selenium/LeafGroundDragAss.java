package week4day2assignments;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDragAss {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/drag.xhtml");
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("(//table[@role='grid']/thead/tr/th[1])[1]"));
		WebElement target = driver.findElement(By.xpath("(//table[@role='grid']/thead/tr/th[3])[1]"));
		act.clickAndHold(source).dragAndDrop(source, target).perform();
		act.clickAndHold(target).dragAndDrop(target, source).perform();
		Thread.sleep(2000);
		String toastMessage = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getText();
		System.out.println(toastMessage);
		WebElement rowsource = driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[3])[2]"));
		WebElement rowtarget = driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[4])[2]"));
		act.dragAndDrop(rowsource, rowtarget).perform();
		act.dragAndDrop(rowtarget, rowsource).perform();
		Thread.sleep(3000);
		String rowtoastMessage = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getText();
		System.out.println(rowtoastMessage);
		WebElement imageResize = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-s')]"));
		Point size = imageResize.getLocation();
		int x = size.getX();
		int y = size.getY();
		System.out.println(x+","+y);
		act.dragAndDropBy(imageResize, 100, 0).perform();
		Point size2 = imageResize.getLocation();
		int x2 = size2.getX();
		int y2 = size2.getY();
		System.out.println(x2+","+y2);
		WebElement leftSlider = driver.findElement(By.xpath("(//span[contains(@class,'ui-slider-handle')])[1]"));
		act.clickAndHold(leftSlider).moveByOffset(-20, 0).perform();
		WebElement rightSlider = driver.findElement(By.xpath("(//span[contains(@class,'ui-slider-handle')])[2]"));
		act.clickAndHold(rightSlider).moveByOffset(10, 0).perform();
		
		
		

	}

}
