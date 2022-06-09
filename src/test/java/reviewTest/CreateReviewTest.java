package reviewTest;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import pages.Review;

public class CreateReviewTest {
	
	private static WebDriver driver;
	private Review review;
	
	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(false);
		driver = new ChromeDriver(options);
	}
	
	@Before
	public void setup() {
		driver.get(Review.getUrl());
		this.review = PageFactory.initElements(driver, Review.class);
	}
	
	
	
	@Test
	public void createTest() throws InterruptedException {
		review.readAll();
		
		Thread.sleep(2000);
		List<WebElement> rowsBefore = driver.findElements(By.xpath("//*[@id=\"table_body_review\"]/tr"));
		int rowsLenBefore = rowsBefore.size();
		
		review.create("john", "doe", "it was a good read","1");
		
		Thread.sleep(2000);
		review.readAll();
		
		Thread.sleep(2000);
		List<WebElement> rowsAfter = driver.findElements(By.xpath("//*[@id=\"table_body_review\"]/tr"));
		int rowsLenAfter = rowsAfter.size();
		
		boolean added = rowsLenAfter > rowsLenBefore;
		
		assertTrue(added);	
	}
	
	
    @After
    public void tearDown() {
        driver.quit();
    }
		

}
