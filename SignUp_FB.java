import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUp_FB {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\All_Driver\\geckodriver.exe");
		WebDriver fd=new FirefoxDriver();
		fd.get("https://www.facebook.com");
		Thread.sleep(3000);
	    //fd.manage().window().maximize();
		Thread.sleep(3000);
		fd.findElement(By.xpath("//*[@id='u_0_e']")).sendKeys("md");
		Thread.sleep(3000);
		fd.findElement(By.id("u_0_g")).sendKeys("rahman");
		Thread.sleep(3000);
		fd.findElement(By.cssSelector("*[id='u_0_j']")).sendKeys("asdff12@gmail.com");
		Thread.sleep(3000);
		fd.findElement(By.cssSelector("*[id='u_0_m']")).sendKeys("asdff12@gmail.com");



		
		Thread.sleep(3000);
		fd.findElement(By.cssSelector("*[id='u_0_q']")).sendKeys("hgfda21");
		Thread.sleep(3000);
		
        WebElement ele1=fd.findElement(By.id("month"));
        Select select1=new Select(ele1);
        select1.selectByVisibleText("Feb");
        Thread.sleep(3000);
        Select select2=new Select(fd.findElement(By.id("day")));
        select2.selectByVisibleText("15");
        Thread.sleep(3000);
        Select select3=new Select(fd.findElement(By.id("year")));
        select3.selectByVisibleText("1990");
        Thread.sleep(3000);
        
        
        fd.findElement(By.id("u_0_c")).click();
        
        /*List<WebElement> list=fd.findElements(By.xpath("//input[@type='radio'"));
        System.out.println("The number of radio button is"+ list.size());
        
        System.out.println(list.get(0)+"---"+ list.get(0).getText());
        for (int i=0; i<list.size(); i++){
        }*/
        
        
        
	}

}
