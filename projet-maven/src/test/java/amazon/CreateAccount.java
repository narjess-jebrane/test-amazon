package amazon;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
@org.junit.Test
	
	public void testmustbepassed () {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		
		String url = "https://www.amazon.fr/";
		
		d.get(url);
		
		d.manage().window().maximize();
		
		WebElement e = d.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		
		e.click();
		
		WebElement e1 = d.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		
		e1.click();
		
		WebElement name = d.findElement(By.xpath("//input[@id='ap_customer_name']"));
		
		name.sendKeys("Yassine");
		
		WebElement Adress = d.findElement(By.xpath("//input[@id='ap_email']"));
		
		Adress.sendKeys("Yassine@yahoo.com");
		
		WebElement MDP = d.findElement(By.xpath("//input[@id='ap_password']"));
		
		
		MDP.sendKeys("Yassine123");
		
		WebElement VerifMDP = d.findElement(By.xpath("//input[@id='ap_password_check']"));
		
		VerifMDP.sendKeys("Yassine123");
	
		WebElement Verifemail = d.findElement(By.xpath("//input[@id='continue']"));
		
		Verifemail.click();
		
		String Actualresulat = d.getTitle();
		String Expectresulat = "Connexion Amazon";
		
		
		Assert.assertEquals(Expectresulat, Actualresulat);
		
		
		
		
		
	}
	
@org.junit.Test
	
	public void testmustbefaield () {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		
		String url = "https://www.amazon.fr/";
		
		d.get(url);
		
		d.manage().window().maximize();
		
		WebElement e = d.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		
		e.click();
		
		WebElement e1 = d.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		
		e1.click();
		
		WebElement name = d.findElement(By.xpath("//input[@id='ap_customer_name']"));
		
		name.sendKeys("Yassine");
		
		WebElement Adress = d.findElement(By.xpath("//input[@id='ap_email']"));
		
		Adress.sendKeys("Yassine@yahoo.com");
		
		WebElement MDP = d.findElement(By.xpath("//input[@id='ap_password']"));
		
		
		MDP.sendKeys("123");
		
		WebElement VerifMDP = d.findElement(By.xpath("//input[@id='ap_password_check']"));
		
		VerifMDP.sendKeys("123");
	
		WebElement Verifemail = d.findElement(By.xpath("//input[@id='continue']"));
		
		Verifemail.click();
		
		String Actualresulat = d.getTitle();
		String Expectresulat = "Connexion Amazon";
		
		
		Assert.assertEquals(Expectresulat, Actualresulat);
}
}
