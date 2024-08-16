package slenium.org.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assign {

	WebDriver dri;

	@Parameters("browser")
	@Test
	public void test(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			dri=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			dri=new EdgeDriver();
		}
		dri.get("https://amazon.com");
	}
}
