package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			
			WebElement target = driver.findElement(By.xpath("//h2[text()='HTML Table Tags']"));
			
			JavascriptExecutor obj =  (JavascriptExecutor) driver;
			obj.executeScript("arguments[0].scrollIntoView();", target);
			
			WebElement target1 = driver.findElement(By.xpath("//h2[text()='HTML Table Tags']"));
			
			JavascriptExecutor obj1 =  (JavascriptExecutor) driver;
			obj1.executeScript("arguments[0].scrollIntoView();", target);
			
			//scroll to bottom
			obj1.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			
			//scroll to top
			obj1.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
			
			
			//=======================================================================
			
			Actions act = new Actions(driver);
			
			
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			
			// scroll to bottom
			act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
			

		}

	
	




	}


