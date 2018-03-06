import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_movement {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\All_Driver\\geckodriver.exe");
		WebDriver fd=new FirefoxDriver();
		fd.get("http://www.americangolf.co.uk/");
		fd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//fd.manage().window().maximize();
		Thread.sleep(3000);
		                                           
		WebElement golfclub=fd.findElement(By.xpath(".//*[@id='header-navigation']/div[1]/ul/li[1]/a"));
		Actions act=new Actions(fd);
		act.moveToElement(golfclub).clickAndHold().build().perform();
		Thread.sleep(3000);
		//Clicking on Hybrid sub_menu
		fd.findElement(By.xpath(".//*[@id='CLUBS_1']/ul/li[1]/ul/li[3]/a/span[1]")).click();
		Thread.sleep(3000);
		//WebElement drag_drop=fd.findElement(By.xpath(".//*[@id='secondary']/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div"));
		
		//act.dragAndDropBy(drag_drop, 5, 0).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
