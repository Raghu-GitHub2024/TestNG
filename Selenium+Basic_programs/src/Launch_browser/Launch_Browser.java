package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.close();




}
}