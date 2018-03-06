import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleRadioButton {

	public static void main(String[] args) {
           System.setProperty("webdriver.gecko.driver", "D:\\All_Driver\\geckodriver.exe");
           WebDriver fd=new FirefoxDriver();
           fd.get("http://schools.nyc.gov/Accountability/tools/survey/default.htm");
           
           fd.findElement(By.xpath("//*[@id='doecontrol_CommonTemplatesSummaryPostingTemplate_a_templatecontrol_publishedTopTextRadControl']/p[1]/a")).click();
        
          List<WebElement> radios=fd.findElements(By.xpath(".//*[@name='SelectedLanguageID' and @type='radio' ]"));
          for (int i=0; i<radios.size(); i++) {
        	 WebElement ele=radios.get(i);
        	 String id=ele.getAttribute("value");
        	 if(id.equalsIgnoreCase("3")) {
        		 ele.click();
        		 //break;
        	 }
        	  
          }
           /*System.out.println(radios.get(1).getAttribute("value"));
           fd.findElement(By.id("lang3")).click();*/
           
	}

}
