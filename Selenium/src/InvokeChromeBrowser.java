import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pwd");
		//driver.findElement(By.xpath()).click();
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//close current browser
		//driver.close();
		//It closes all the browsers opened by Selenium script
		driver.quit();
	}

}