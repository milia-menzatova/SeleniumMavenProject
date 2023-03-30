package pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created with IntelliJ IDEA.
 * User: Milia
 * Date:
 * Time: 10:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class LoginPage {
    //METHODS
    public LoginPage setBranchName(WebDriver driver, String branch){
        // Find the text input element 'branch' by its name
        WebElement element = driver.findElement(By.name("j_branch"));
        // Enter branch name
        element.sendKeys(branch);  //??
        return  this;
    }
    public  LoginPage setBranchAdminUsername(WebDriver driver, String branchAdmin){
        // Find the text input element 'username' by its name
        WebElement element = driver.findElement(By.name("j_username"));
        // Enter username
        element.sendKeys(branchAdmin);
        return this;
    }

    public LoginPage setBranchAdminPassword(WebDriver driver, String branchPassword){
        // Find the text input element 'password' by its name
       WebElement element = driver.findElement(By.name("j_password"));

        // Enter password
        element.sendKeys(branchPassword);
        return this;
    }

    public LoginPage clickLoginButton(WebDriver driver){
        // Find the button Login by its id
        WebElement element = driver.findElement(By.id("ext-gen38"));

        // Click Login button
        element.click();
        return this;
    }
}
