package week4day2assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraAss {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		Actions act = new Actions(driver);
		WebElement mouseHover = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		act.moveToElement(mouseHover).perform();
		driver.findElement(By.xpath("(//a[text()='Jackets'])[1]")).click();
		String totalCount = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("Total count of jackets: "+totalCount);
		String jacketsCount = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		Thread.sleep(3000);
		String rainJacketsCount = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		System.out.println("RainJackets counts: "+rainJacketsCount);
		System.out.println("Jackets Count: "+jacketsCount);
		String text1=jacketsCount.replaceAll("[^\\d.]", "");
		String text2=rainJacketsCount.replaceAll("[^\\d.]", "");
		int count1=Integer.parseInt(text1);
		int count2=Integer.parseInt(text2);
		int totalCatCount = count1+count2;
		String catcount = Integer.toString(totalCatCount);
		System.out.println("Total sum of categories: "+catcount);
		if(totalCount.contains(catcount)) {
			System.out.println("The products count are same in both types" );
		}else {
			System.out.println("Both count are not same");
		}
		driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[1]")).click();
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("Duke");
		driver.findElement(By.xpath("//input[@value='Duke']/parent::label")).click();
		driver.findElement(By.xpath("//span[contains(@class,'FilterDirectory-close')]")).click();
		Thread.sleep(5000);
		List<WebElement> listOfJackets = driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h3"));
		
		List<String> brand=new ArrayList<String>();
		for(int i=1;i<=listOfJackets.size();i++) {
			String brandName = driver.findElement(By.xpath("(//div[@class='product-productMetaInfo']/h3)["+i+"]")).getText();
			brand.add(brandName);
		}
		Set<String> dup = new LinkedHashSet<String>(brand);
		if((dup.size()==1) && (dup.contains("Duke"))  ) {
			System.out.println("All coats are from duke brand");
		}else {
			System.out.println("Some coats are from other brands");
		}
		WebElement sortBy = driver.findElement(By.xpath("//div[@class='sort-sortBy']"));
		sortBy.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
		String priceOfFirstProduct = driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println("The price of the product: "+priceOfFirstProduct);
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		List<String> window=new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		File image =driver. getScreenshotAs(OutputType.FILE);
		File des = new File("./snap/screenshot.jpg");
		FileUtils.copyFile(image, des);
		driver.findElement(By.xpath("//div[contains(@class,'pdp-add-to-wishlist')]")).click();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
