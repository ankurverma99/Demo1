package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AleartForcheck {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.id("timerAlertButton")).click();
	WebDriverWait ww=new WebDriverWait(driver,10);
	ww.until(ExpectedConditions.alertIsPresent());
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();;
}
}
