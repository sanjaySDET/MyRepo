package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCnctLookUpImgPage
{
public CreateCnctLookUpImgPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//img[@title='Create Contact...']")
private WebElement createOrgImg;


public void createOrgLkImg()
{
	createOrgImg.click();
}
}
