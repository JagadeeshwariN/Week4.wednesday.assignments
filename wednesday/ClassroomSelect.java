package week4.wednesday;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClassroomSelect {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement selectFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		selectFrame.click();
		
		WebElement item1Select = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item3Select = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item5Select = driver.findElement(By.xpath("//li[text()='Item 5']"));
	
		Actions action= new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(item1Select).click(item3Select).click(item5Select).keyUp(Keys.CONTROL).perform();
		
		
		
		

	}

}
