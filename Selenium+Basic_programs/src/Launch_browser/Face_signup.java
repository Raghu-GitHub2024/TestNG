package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Face_signup {

	public static void main(String[] args) 
	{
		EdgeDriver Face = new EdgeDriver();
		Face.manage().window().maximize();
		Face.get("https://www.facebook.com/");
		WebElement Fac = Face.findElement(By.partialLinkText("Create"));
		Fac.click();
		Fac.findElement(By.name("c")).sendKeys("Dinesh");
		Fac.findElement(By.name("lastname")).sendKeys("Kumar");
		Fac.findElement(By.name("reg_email__")).sendKeys("123456789");
		Fac.findElement(By.id("password_step_input")).sendKeys("password1");

	}

}
