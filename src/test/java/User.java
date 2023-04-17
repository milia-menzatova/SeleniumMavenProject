import dataprovider.UserDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class User {
    @Test(dataProvider = "CreateUser", dataProviderClass = UserDataProvider.class)
   // @Parameters(value = {"branch", "branchAdmin", "branchPassword", "user", "password"})
    public void AddUser(String branch, String branchAdmin, String branchPassword, String user, String password, String warning){
        String webdriverPath = "C:\\Users\\milia\\IdeaProjects\\SeleniumMavenProgect\\webdriver";
        // Set GeckoDriver
        System.setProperty("webdriver.gecko.driver", webdriverPath + "\\geckodriver-v0.32.1.exe");
       // Create a new instance of Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Create an instance of class Login to use its LMSLogin method in our Add User scenario
        //Create Objects required for this test
        Login login = new Login();

        // Login to LMS - using LMSLogin method of class Login and passing 'driver'
        // argument to the method to re-use Firefox browser already opened

        login.LMSLogin(driver, branch, branchAdmin, branchPassword);

        // try to sleep (wait) for 5 sec (using exception handler)
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        // Find button 'Users' by its id
        WebElement element = driver.findElement(By.id("ext-gen185"));
        // Click button 'Users'
        element.click();

        // Find button 'Actions' by its xpath
        element = driver.findElement(By.xpath("//td[1]/table/tbody/tr/td[2]/em/button"));
        // Click button 'Actions'
        element.click();

        // try to sleep (wait) for 5 sec (using exception handler)
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        // Find menu item 'Add User' by link text
        element = driver.findElement(By.linkText("Add User"));
        // Click menu item 'Add User'
        element.click();

        // Find the text input element 'username' by its name
        element = driver.findElement(By.name("Username"));
        // Enter username
        element.sendKeys(user);

        // Find the text input element 'password' by its name
        element = driver.findElement(By.name("Password"));
        element.sendKeys(password);

        // Find button 'Save' by its xpath
        element = driver.findElement(By.xpath("//div[5]/div/div[2]/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button"));
        element.click();

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        if (warning != ""){
            WebElement body = driver.findElement(By.tagName("body"));
            boolean ret = body.getText().contains(warning);
            System.out.println(ret);
            // find button ok by xpath and click it to close pop up
            driver.findElement(By.xpath("//div[2]/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td[2]")).click();
            // Find button 'Cancel' by its xpath
            element = driver.findElement(By.xpath("//div[5]/div/div[2]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/em/button"));
            // Click button 'Cancel'
            element.click();
        }else{

            // verify the results by parsing html page and making sure it contain just created username
            WebElement body = driver.findElement(By.tagName("body"));
            boolean ret = body.getText().contains(user);
            System.out.println(ret);
        }


        // Find button 'Logout' by its xpath
        element = driver.findElement(By.xpath("//div[5]/div/div/div/div[2]/div[1]/div/div/div[1]/div/table/tbody/tr/td[5]/table/tbody/tr/td[2]/em/button"));
        element.click();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        driver.close();
    }
}
