package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//FindBy - PageObject Factory
public class SignUp {
	
	@FindBy(id="signin2")
	WebElement signUpLink;
	
	@FindBy(id="sign-username")
	WebElement username;
	
	@FindBy(id="sign-password")
	WebElement password;
	
	@FindBy(xpath="//button[@onclick='register()']")
	WebElement signUpBtn;
	
	
	WebDriver driver;
	public SignUp(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement signUpLink() {
		return signUpLink;
	}
	
	public WebElement signupUsername() {
		return username;
	}
	
	public WebElement signUpPassword() {
		return password;
	}
	
	public WebElement signUpBtn() {
		return signUpBtn;
	}
	}


