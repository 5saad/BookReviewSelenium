package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Review {
	
	private static final String URL = "http://127.0.0.1:5500/";
	
	
	@FindBy(id = "review id")
	private WebElement reviewId;
	
	@FindBy(id = "first name")
	private WebElement fname;
	
	@FindBy(id = "surname")
	private WebElement sname;
	
	@FindBy(xpath = "//*[@id=\"rating\"]/option[4]")
	private WebElement rating4;
	
	@FindBy(id = "review")
	private WebElement rev;
	
	@FindBy(id = "book id review")
	private WebElement bookId;
	
	@FindBy(id = "create review")
	private WebElement create;
	
	@FindBy(id = "read all reviews")
	private WebElement readAll;
	
	@FindBy(id = "table_body_review")
	private WebElement table;
	
	@FindBy(id = "delete review")
	private WebElement delete;
	
	@FindBy(id = "review by id")
	private WebElement findById;
	
	@FindBy(id = "find by rating")
	private WebElement findByRating;
	
	@FindBy(id = "update review")
	private WebElement updateReview;
	
	
	
	
	public void create(String firstName, String surname, String review, String id) {
		fname.sendKeys(firstName);
		sname.sendKeys(surname);
		rev.sendKeys(review);
		bookId.sendKeys(id);
		
		create.click();
	}
	
	public void readAll() {
		readAll.click();
	}
	
	public void findByRating4(String str) {
		rating4.click();
		findByRating.click();
	}
	
	public void findByRating1() {
		findByRating.click();
	}
	
	
	public void delete(String num) {
		reviewId.sendKeys(num);
		delete.click();
	}
	
	public void update(String id, String firstName, String surname, String review, String book) {
		rating4.click();
		reviewId.sendKeys(id);
		fname.sendKeys(firstName);
		sname.sendKeys(surname);
		rev.sendKeys(review);
		bookId.sendKeys(book);
		updateReview.click();
	}
	
	public void findById(String num) {
		reviewId.sendKeys(num);
		findById.click();
	}

	public static String getUrl() {
		return URL;
	}

	public WebElement getReviewId() {
		return reviewId;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getSname() {
		return sname;
	}

	public WebElement getRating4() {
		return rating4;
	}

	public WebElement getRev() {
		return rev;
	}

	public WebElement getBookId() {
		return bookId;
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

	public WebElement getFindByRating() {
		return findByRating;
	}

	public WebElement getUpdateReview() {
		return updateReview;
	}

}
