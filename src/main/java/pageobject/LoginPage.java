package pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Milia
 * Date:
 * Time: 10:53 AM
 * To change this template use File | Settings | File Templates.
 * setBranchName - that method will type branch name into edit field 'Branch' of Login dialog
 * setBranchAdminUsername - that method will type branch admin username into edit field 'Username' of Login dialog
 * setBranchAdminPassword - that method will type admin password into edit field 'Password' of Login dialog
 * clickLoginButton - that method will click Login button of Login dialog
 */
public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    // LOCATORS
    //text field 'branch name'
    @FindBy(how = How.NAME, using = "j_branch")
    private WebElement branchName;

    //text field 'branch admin username'
    @FindBy(how = How.NAME, using = "j_username")
    private WebElement branchAdminUsername;

    //text field 'password'
    @FindBy(how = How.NAME, using = "j_password")
    private WebElement branchAdminPassword;

    //button 'Login'
    @FindBy(how = How.NAME, using = "ext-gen38")
    private WebElement buttonLogin;

    //METHODS
    public LoginPage setBranchName(WebDriver driver, String branch){
//        // Find the text input element 'branch' by its name
//        WebElement element = driver.findElement(By.name("j_branch"));
//        // Enter branch name
//        element.sendKeys(branch);  //??
        branchName.sendKeys(branch);
        return  this;
    }
    public  LoginPage setBranchAdminUsername(WebDriver driver, String branchAdmin){
//        // Find the text input element 'username' by its name
//        WebElement element = driver.findElement(By.name("j_username"));
//        // Enter username
        branchAdminUsername.sendKeys(branchAdmin);
        return this;
    }

    public LoginPage setBranchAdminPassword(WebDriver driver, String branchPassword){
        // Find the text input element 'password' by its name
//       WebElement element = driver.findElement(By.name("j_password"));

        // Enter password
        branchAdminPassword.sendKeys(branchPassword);
        return this;
    }

    public LoginPage clickLoginButton(WebDriver driver){
        // Find the button Login by its id
//        WebElement element = driver.findElement(By.id("ext-gen38"));

        // Click Login button
        buttonLogin.click();
        return this;
    }
}
