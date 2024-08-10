package books;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qsp.genericutility.BaseClass;
import com.qsp.genericutility.ExcelUtilityClass;
import com.qsp.objectrepository.HomePage;
import com.qsp.objectrepository.WelcomePage;

public class TC_DWS_005_Test extends BaseClass{

	@Test
	public void clickOnBooks() throws EncryptedDocumentException, IOException {
		wp=new WelcomePage(driver);
		hp = new HomePage(driver);
	hp.getGetbookLink();
		ExcelUtilityClass excel = new ExcelUtilityClass();
		String actualTitle = driver.getTitle();
		String ExpectedTitle = excel.getStringDataFromExcel("Books",1,0);
		Assert.assertEquals(actualTitle, ExpectedTitle,"books page is not displatyed");
		Reporter.log("books page is displayed",true);
		
	}

}
