package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Book {
	
	private static final String URL = "http://127.0.0.1:5500/";
	
	
	@FindBy(id = "book id")
	private WebElement bookId;
	
	@FindBy(id = "title")
	private WebElement title;
	
	@FindBy(id = "description")
	private WebElement description;
	
	@FindBy(id = "author")
	private WebElement author;
	
	@FindBy(id = "create book")
	private WebElement create;
	
	@FindBy(id = "read all books")
	private WebElement readAll;
	
	@FindBy(id = "table_body_book")
	private WebElement table;
	
	@FindBy(id = "delete book")
	private WebElement delete;
	
	@FindBy(id = "book by id")
	private WebElement findById;
	
	@FindBy(id = "find by author")
	private WebElement findByAuthor;
	
	@FindBy(id = "update book")
	private WebElement updateBook;
	
	
	
	
	public void create(String tit, String desc, String auth) {
		title.sendKeys(tit);
		description.sendKeys(desc);
		author.sendKeys(auth);
		create.click();
	}
	
	public void readAll() {
		readAll.click();
	}
	
	public void findByAuthor(String str) {
		author.sendKeys(str);
		findByAuthor.click();
	}
	
	
	public void delete(String num) {
		bookId.sendKeys(num);
		delete.click();
	}
	
	public void update(String num, String tit, String desc, String auth) {
		bookId.sendKeys(num);
		title.sendKeys(tit);
		description.sendKeys(desc);
		author.sendKeys(auth);
		updateBook.click();
	}
	
	public void findById(String num) {
		bookId.sendKeys(num);
		findById.click();
	}
	


	public static String getUrl() {
		return URL;
	}



	public WebElement getBookId() {
		return bookId;
	}



	public WebElement getTitle() {
		return title;
	}



	public WebElement getDescription() {
		return description;
	}



	public WebElement getAuthor() {
		return author;
	}



	public WebElement getCreate() {
		return create;
	}

	public WebElement getReadAll() {
		return readAll;
	}

	public WebElement getTable() {
		return table;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getFindById() {
		return findById;
	}

	public WebElement getFindByAuthor() {
		return findByAuthor;
	}

	public WebElement getUpdateBook() {
		return updateBook;
	}
}
