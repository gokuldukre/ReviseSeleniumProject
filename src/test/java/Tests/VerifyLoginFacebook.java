package Tests;


import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import PageObject.LoginPom;
import Utility.BaseClass;

public class VerifyLoginFacebook extends BaseClass {
	@Test
	
	public void test001() {
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	LoginPom login=	PageFactory.initElements(driver, LoginPom.class);
	login.getTxt_Email().sendKeys("email");
	login.getTxt_Pass().sendKeys("12456");
	login.getBtn_Login().click();
		
	}

}
