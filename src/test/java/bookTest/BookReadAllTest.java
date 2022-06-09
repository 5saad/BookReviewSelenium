package bookTest;

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

import pages.Book;

public class BookReadAllTest {

	private static WebDriver driver;
	private Book book;
	
	@BeforeClass
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(false);
		driver = new ChromeDriver(options);
	}
	
	@Before
	public void setup() {
		driver.get(Book.getUrl());
		this.book = PageFactory.initElements(driver, Book.class);
	}
	

	
	@Test
	public void readAllTest() throws InterruptedException {
		book.create("Cool Title", "Nice Descriptipn", "Some Smart Dude");
		book.readAll();
		Thread.sleep(2000);
		List<WebElement> rowsBefore = driver.findElements(By.xpath("//*[@id=\"table_body_book\"]/tr"));
		int rowsLen = rowsBefore.size();
		
		assertTrue(rowsLen>0);
	}
	
	
    @After
    public void tearDown() {
        driver.quit();
    }
		

}