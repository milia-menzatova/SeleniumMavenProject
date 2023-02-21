package hitek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

    public static void main(String[] args){
        // Create a new instance of the firefox driver
        WebDriver driver = new FirefoxDriver();

       // And now use this to visit LMS login page
        driver.get("http://dev-hitekschool.com/lms/ca.hts.lms.gwt.Login/Login.html");

       // Maximize window
       driver.manage().window().maximize();

        // Read the title of the page and put it into results
        System.out.println("Page title is: " + driver.getTitle());

        // close the browser
        driver.close();


    }
}
