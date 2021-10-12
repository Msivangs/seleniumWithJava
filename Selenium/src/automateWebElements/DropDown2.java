package automateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://beta.spicejet.com/");
		driver.findElement(By.xpath("//div[contains(text(),'Passengers')]")).click();
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]")).click();

	}

}
