import dataprovider.CustomerDataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Customers {

    @Test(dataProvider = "CreateCustomer", dataProviderClass = CustomerDataProvider.class)
    //@Parameters(value = {"branch", "branchAdmin","branchPassword", "firstName", "lastName"})
    public void AddCustomer(String branch, String branchAdmin,
                            String branchPassword, String firstName,
                            String lastName, String warning){
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

        // Find the text input element 'First Name' by its name
        element = driver.findElement(By.name("FirstName"));
        element.sendKeys(firstName);

        // Find the text input element 'Last Name' by its name
        element = driver.findElement(By.name("LastName"));
        element.sendKeys(lastName);

        // Find button 'Save' by its xpath
        element = driver.findElement(By.xpath("//div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/em[1]/button[1]"));
        element.click();

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        if(warning != ""){
            WebElement body = driver.findElement(By.tagName("body"));
            boolean cust = body.getText().contains(warning);
            System.out.println(cust);
            // find button ok by xpath and click it to close pop up
            driver.findElement(By.xpath("//div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]")).click();
            // Find button 'Cancel' by its xpath
            element = driver.findElement(By.xpath("//div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/em[1]/button[1]"));
            element.click();

        }else {
            // verify the results by parsing html page and making sure it contain just created customer
            WebElement body = driver.findElement(By.tagName("body"));
            boolean cust = body.getText().contains(firstName);
            System.out.println(cust);

        }



        // Find button 'Logout' by its xpath
        element = driver.findElement(By.xpath("//div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/table[1]/tbody[1]/tr[1]/td[2]/em[1]/button[1]"));
        element.click();

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //close the browser
        driver.close();




    }
}
