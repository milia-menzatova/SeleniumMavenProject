import dataprovider.CustomerDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Customers {
    @Test(dataProvider = "CreateCustomer", dataProviderClass = CustomerDataProvider.class)
    public void AddCustomer (String branch, String branchAdmin, String branchPassword, String customers, String password, String warning){
        String webdriverPath = "C:\\Users\\milia\\IdeaProjects\\SeleniumMavenProgect\\webdriver";
        // Set GeckoDriver
        System.setProperty("webdriver.gecko.driver", webdriverPath + "\\geckodriver-v0.32.1.exe");
        // Create a new instance of Firefox driver
        WebDriver driver = new FirefoxDriver();

        Login login = new Login();
        login.LMSLogin(driver, branch, branchAdmin, branchPassword);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        // Find button 'Customers' by its id
        WebElement element = driver.findElement(By.id("ext-gen192"));
        element.click();

        // Find button 'Actions' by its xpath
       element = driver.findElement(By.xpath("//td[1]/table[1]/tbody[1]/tr[1]/td[2]/em[1]/button[1]"));
       element.click();

       try {
           Thread.sleep(5000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }

        // Find menu item 'Customers' by link text
        element = driver.findElement(By.linkText("Add Customer"));
       element.click();

    }
}
