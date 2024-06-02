package Launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Auto {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Search.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = auto.size();
		System.out.println(count);
		auto.get(0).click();
		List<WebElement>shoe = driver.findElements(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoe.get(0).click();
	
		
		

	}

}
