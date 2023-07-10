package config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    String browser="GC";
	String URL="http://www.peramsons.com/jobportal/Kriya_old/";
	WebDriver d;
	
	public void launchbrowser()
	{
		if (browser.equals("GC"))
		{
			d= new ChromeDriver();
			}
		else if (browser.equals("FF"))
		{
			d=new FirefoxDriver();
		}
		else if (browser.equals("Edge"))
		{
			d=new EdgeDriver();
			}
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
	}

	public void teardown()
	{
		
	d.quit();
	
	}
	
	}
