package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class OrangeHrmsTest{
    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("🔹 BeforeSuite → Setup global preconditions (e.g., DB, reports)");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("🔹 AfterSuite → Cleanup global resources");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("🔹 BeforeTest → Runs before <test> in testng.xml");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("🔹 AfterTest → Runs after <test> in testng.xml");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("🔹 BeforeClass → Initialize WebDriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("🔹 AfterClass → Close WebDriver");
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("🔹 BeforeMethod → Navigate to App before each test");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("🔹 AfterMethod → Runs after each @Test");
    }

    @Test(priority = 1, groups = "smoke")
    public void verifyLogo() {
        System.out.println("🔹 Running verifyLogo Test");
        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
        Assert.assertTrue(logo.isDisplayed(), "❌ Logo is not displayed!");
        System.out.println("✅ Logo is displayed");
    }

    @Test(priority = 2, groups = "regression")
    public void loginTest() {
        System.out.println("🔹 Running loginTest");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
        Assert.assertTrue(dashboard.isDisplayed(), "❌ Dashboard is not displayed!");
        System.out.println("✅ Login successful, Dashboard visible");
    }
}
