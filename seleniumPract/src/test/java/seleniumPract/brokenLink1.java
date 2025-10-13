package seleniumPract;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLink1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The size of the element is "+links.size());
		for (WebElement link : links) {
			String url=link.getAttribute("href");
			if (url==null || url.isEmpty()) {
				System.out.println("No URL found");
				continue;
				
			}
			//converting to URL 
			try {
				
				URL urlname =new URL(url);
				HttpURLConnection conn=(HttpURLConnection) urlname.openConnection();
				conn.connect();
				if (conn.getResponseCode()>=400) {
					System.out.println(urlname+"This is broken link");
					
				}
				else {
					System.out.println(urlname+ "This is link");
				}
		
			}
			catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}
			
			
		}
		driver.quit();
	}
}