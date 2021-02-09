import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/HP/Desktop/sam1.html");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("textA")).sendKeys("name");
	WebDriverWait ww=new WebDriverWait(driver,10);
	ww.until(ExpectedConditions.textToBePresentInElementValue(By.name("textA"),"name"));
	driver.findElement(By.name("textB")).sendKeys("priyanka");
}
}
