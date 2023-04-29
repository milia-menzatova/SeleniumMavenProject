import common.LoanAppHelper;
import dataprovider.UserDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pageobject.AddUserPage;
import pageobject.HomePage;
import pageobject.UsersPage;

public class User {
    @Test(dataProvider = "CreateUser", dataProviderClass = UserDataProvider.class)
   // @Parameters(value = {"branch", "branchAdmin", "branchPassword", "user", "password"})
    public void AddUser(String branch, String branchAdmin, String branchPassword, String user, String password, String warning){
        String webdriverPath = "C:\\Users\\milia\\IdeaProjects\\SeleniumMavenProgect\\webdriver";
        // Set GeckoDriver
        System.setProperty("webdriver.gecko.driver", webdriverPath + "\\geckodriver-v0.32.1.exe");
       // Create a new instance of Firefox driver
        WebDriver driver = new FirefoxDriver();
        int numberOFMilliseconds = 5000;

        // Create an instance of class Login to use its LMSLogin method in our Add User scenario
        //Create Objects required for this test
        Login login = new Login();
        HomePage homePage = new HomePage(driver);
        UsersPage usersPage = new UsersPage(driver);
        AddUserPage addUserPage = new AddUserPage(driver);
        LoanAppHelper loanAppHelper = new LoanAppHelper();

        // Login to LMS - using LMSLogin method of class Login and passing 'driver'
        // argument to the method to re-use Firefox browser already opened

        login.LMSLogin(driver, branch, branchAdmin, branchPassword);

        // try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
//        // Find button 'Users' by its id
//        WebElement element = driver.findElement(By.id("ext-gen185"));
//        // Click button 'Users'
//        element.click();
//
//        // Find button 'Actions' by its xpath
//        element = driver.findElement(By.xpath("//td[1]/table/tbody/tr/td[2]/em/button"));
//        // Click button 'Actions'
//        element.click();

        //Click button 'Users'
        homePage.clickUserButton(driver);

        // try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
//        // Find menu item 'Add User' by link text
//        element = driver.findElement(By.linkText("Add User"));
//        // Click menu item 'Add User'
//        element.click();
//
//        // Find the text input element 'username' by its name
//        element = driver.findElement(By.name("Username"));
//        // Enter username
//        element.sendKeys(user);
//
//        // Find the text input element 'password' by its name
//        element = driver.findElement(By.name("Password"));
//        element.sendKeys(password);
//
//        // Find button 'Save' by its xpath
//        element = driver.findElement(By.xpath("//div[5]/div/div[2]/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button"));
//        element.click();
        //Click button 'Action'
      usersPage.clickActionButton(driver);

        loanAppHelper.sleep(numberOFMilliseconds);

        //Click 'Add User' link
        usersPage.clickAddUserLink(driver);
        loanAppHelper.sleep(numberOFMilliseconds);

        //Enter 'Username'
        addUserPage.setUsername(driver,user);
        //Enter 'Password'
        addUserPage.setPassword(driver, password);
        //Click button 'Save'
        addUserPage.clickSaveButton(driver);
        loanAppHelper.sleep(numberOFMilliseconds);

        if (warning != ""){
            loanAppHelper.doesTextExistOnPage(driver, warning);
            // click Ok button to close pop up
           addUserPage.clickOkButton(driver);
            // Click button 'Cancel'
            addUserPage.clickCancel(driver);

        }else{

            // verify the results by parsing html page and making sure it contain just created username
            loanAppHelper.doesTextExistOnPage(driver, user);
        }


//
//        // Find button 'Logout' by its xpath
//        element = driver.findElement(By.xpath("//div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div/table/tbody/tr/td[5]/table/tbody/tr/td[2]/em/button"));
//        element.click();
        //Click button 'Logout'
        usersPage.clickLogoutButton(driver);

        loanAppHelper.sleep(numberOFMilliseconds);

        driver.close();
    }
    @Test(dataProvider = "CreateUser", dataProviderClass = UserDataProvider.class)
    // @Parameters(value = {"branch", "branchAdmin", "branchPassword", "user", "password"})
    public void AddUser1(String branch, String branchAdmin, String branchPassword, String user, String password, String warning){
        String webdriverPath = "C:\\Users\\milia\\IdeaProjects\\SeleniumMavenProgect\\webdriver";
        // Set GeckoDriver
        System.setProperty("webdriver.gecko.driver", webdriverPath + "\\geckodriver-v0.32.1.exe");
        // Create a new instance of Firefox driver
        WebDriver driver = new FirefoxDriver();
        int numberOFMilliseconds = 5000;

        // Create an instance of class Login to use its LMSLogin method in our Add User scenario
        //Create Objects required for this test
        Login login = new Login();
        HomePage homePage = new HomePage(driver);
        UsersPage usersPage = new UsersPage(driver);
        AddUserPage addUserPage = new AddUserPage(driver);
        LoanAppHelper loanAppHelper = new LoanAppHelper();

        // Login to LMS - using LMSLogin method of class Login and passing 'driver'
        // argument to the method to re-use Firefox browser already opened

        login.LMSLogin(driver, branch, branchAdmin, branchPassword);

        // try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
//

        //Click button 'Users'
        loanAppHelper.clickElementByID(driver, "ext-gen185");

        // try to sleep (wait) for 5 sec (using exception handler)
        loanAppHelper.sleep(numberOFMilliseconds);
//
        //Click button 'Action'
       loanAppHelper.clickElementByXPath(driver,"//td[1]/table/tbody/tr/td[2]/em/button");

        loanAppHelper.sleep(numberOFMilliseconds);

        //Click 'Add User' link
        loanAppHelper.clickElementByLinkName(driver, "Add User");
        loanAppHelper.sleep(numberOFMilliseconds);

        //Enter 'Username'
        addUserPage.setUsername(driver,user);
        //Enter 'Password'
        addUserPage.setPassword(driver, password);
        //Click button 'Save'
        loanAppHelper.clickElementByXPath(driver, "//div[5]/div/div[2]/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button");

        loanAppHelper.sleep(numberOFMilliseconds);

        if (warning != ""){
            loanAppHelper.doesTextExistOnPage(driver, warning);
            // click Ok button to close pop up
          loanAppHelper.clickElementByXPath(driver, "//div[2]/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td[2]");
            // Click button 'Cancel'
           loanAppHelper.clickElementByXPath(driver, "//div[5]/div/div[2]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em/button");

        }else{

            // verify the results by parsing html page and making sure it contain just created username
            loanAppHelper.doesTextExistOnPage(driver, user);
        }



        //Click button 'Logout'
       loanAppHelper.clickElementByXPath(driver, "//div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div/table/tbody/tr/td[5]/table/tbody/tr/td[2]/em/button");

        loanAppHelper.sleep(numberOFMilliseconds);

        driver.close();
    }


    }

