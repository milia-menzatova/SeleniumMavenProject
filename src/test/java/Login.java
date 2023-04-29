import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.LoginPage;

public class Login {
    @Test
    public void LMSLogin(WebDriver driver, String branch, String branchAdmin, String branchPassword) {
        String webdriverPath = "C:\\Users\\milia\\IdeaProjects\\SeleniumMavenProgect\\webdriver";
        // Set GeckoDriver
        System.setProperty("webdriver.gecko.driver", webdriverPath + "\\geckodriver-v0.32.1.exe");
        //System.setProperty("webdriver.chrome.driver", webdriverPath + "\\chromedriver-v109.exe");

        // Create a new instance of the firefox driver
        //WebDriver driver = new FirefoxDriver();

        ////Create Objects required for this test
        LoginPage loginPage = new LoginPage(driver);
        //  Open LMS login page
        driver.get("https://dev-hitekschool.com/lms/loans/2108");

        // Maximize window
       //driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(800, 900));


        // Read the title of the page and put it into results
        System.out.println("Page title is: " + driver.getTitle());

        // Enter branch name
        loginPage.setBranchName(driver, branch);

        //Enter username
        loginPage.setBranchAdminUsername(driver, branchAdmin);

        // Enter branch admin password
        loginPage.setBranchAdminPassword(driver,branchPassword);

        // Click Login button
        loginPage.clickLoginButton(driver);


//        // Find the text input element 'branch' by its name
//        WebElement element = driver.findElement(By.name("j_branch"));
//        // Enter branch name
//        element.sendKeys("Coquitlam");
//        // Find the text input element 'username' by its name
//        element = driver.findElement(By.name("j_username"));
//        // Enter username
//        element.sendKeys(branchAdmin);
//        // Find the text input element 'password' by its name
//        element = driver.findElement(By.name("j_password"));
//        // Enter password
//        element.sendKeys(branchPassword);
//        // Find the button Login by its id
//        element = driver.findElement(By.id("ext-gen38"));
//        // Click Login button
//        element.click();

       // Try to sleep (wait) for 10 sec (using exception handler)
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        // Read the title of the page and put it into results
        System.out.println("Page title is: " + driver.getTitle());
        // Verify the title of the page
        Assert.assertEquals(driver.getTitle(), "Loan Management System - '" + branch + "' branch");

        // Try to sleep (wait) for 10 sec (using exception handler)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        //driver.close();


    }
}