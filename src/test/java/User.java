import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class User {
    @Test
    public void AddUser(){
        String webdriverPath = "C:\\Users\\milia\\IdeaProjects\\SeleniumMavenProgect\\webdriver";
        // Set GeckoDriver
        System.setProperty("webdriver.gecko.driver", webdriverPath + "\\geckodriver-v0.32.1.exe");
       // Create a new instance of Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Create an instance of class Login to use its LMSLogin method in our Add User scenario
        Login login = new Login();

        // Login to LMS - using LMSLogin method of class Login and passing 'driver'
        // argument to the method to re-use Firefox browser already opened
        login.LMSLogin(driver);

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
        element.sendKeys("tommy");

        // Find the text input element 'password' by its name
        element = driver.findElement(By.name("Password"));
        element.sendKeys("password01");

        // Find button 'Save' by its xpath
        element = driver.findElement(By.xpath("//div[5]/div/div[2]/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/em/button"));
        element.click();

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        // verify the results by parsing html page and making sure it contain just created username
        WebElement body = driver.findElement(By.tagName("body"));
        boolean ret = body.getText().contains("tommy");
        System.out.println(ret);

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
