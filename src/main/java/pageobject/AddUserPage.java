package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {
    //this is constructor
    public AddUserPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    //LOCATORS
    //text field 'Username'
    @FindBy(how = How.NAME, using = "Username")
    private WebElement userName;

    //text field 'Password'
    @FindBy(how = How.NAME, using = "Password")
    private WebElement userPassword;

    //button 'Save'
    @FindBy(how = How.XPATH, using = "//div[5]/div/div[2]/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button")
    private WebElement buttonSave;

    //button 'Cancel'
    @FindBy(how = How.XPATH, using = "//div[5]/div/div[2]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em/button")
    private WebElement buttonCancel;

    //button 'Ok' to close warning message
    @FindBy(how = How.XPATH, using = "//div[2]/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td[2]")
    private WebElement buttonOk;

    //METHODS
    public AddUserPage setUsername(WebDriver driver, String username){
        //Enter username
        userName.sendKeys(username);
        return  this;
    }
    public AddUserPage setPassword (WebDriver driver, String password){
        //Enter password
        userPassword.sendKeys(password);
        return this;
    }
    public AddUserPage clickSaveButton(WebDriver driver){
        //Click Save button
        buttonCancel.click();
        return this;
    }
    public AddUserPage clickCancel(WebDriver driver){
        //click Cancel button
        buttonCancel.click();
        return this;
    }
    public AddUserPage clickOkButton(WebDriver driver){
        //click Ok button
        buttonOk.click();
        return this;
    }


}
