package selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola Selenium");
		 String exePath = "./driver/chromedriver";
	        System.setProperty("webdriver.chrome.driver", exePath);
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	}

}
