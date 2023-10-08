package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy (how=How.XPATH, using="//*[@id=\\\"email\\\"]") private WebElement text_email;
	@FindBy (how=How.XPATH, using="//*[@id=\\\"pass\\\"]") private WebElement text_pass;
	@FindBy (how=How.XPATH, using="//*[@id=\\\"loginbutton\\\"]") private WebElement Btn_login;
	public WebElement getTxt_Email() {
		return text_email;
	}
	
	public WebElement getTxt_Pass() {
		return text_pass;
	}
	
	public WebElement getBtn_Login() {
		return Btn_login;
	}
	}


