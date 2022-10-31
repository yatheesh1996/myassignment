package week4day2assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealAss {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"))).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		String shoesCount1 = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("The total count of the sport shoes in this web page: "+shoesCount1);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		String shoesCount2 = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println("The count of sport shoes after sorting low to high: "+shoesCount2);
		if(shoesCount1.equals(shoesCount2)) {
			System.out.println("Not sorted");
		}
		else {
			System.out.println("The products are sorted correctly");
		}
		driver.findElement(By.name("fromVal")).clear();
		driver.findElement(By.name("fromVal")).sendKeys("900");
		driver.findElement(By.name("toVal")).clear();
		driver.findElement(By.name("toVal")).sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Color_s-Yellow']")).click();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'col-xs-6 last-no-border')]"))).perform();
		Thread.sleep(3000);
		act.click(driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]"))).perform();
		String price = driver.findElement(By.className("payBlkBig")).getText();
		System.out.println(price);
		String discountPercent = driver.findElement(By.xpath("(//div[contains(@class,'product-price ')]/span)[2]")).getText();
		System.out.println(discountPercent);
		WebElement shoeImg = driver.findElement(By.xpath("(//div[@class='bx-wrapper'])[2]"));
		Thread.sleep(2000);
		File image =shoeImg. getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/shoe.jpg");
		FileUtils.copyFile(image, des);
		driver.quit();
		
		
		
		
		

	}

}
