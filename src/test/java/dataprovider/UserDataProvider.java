package dataprovider;
import org.testng.annotations.DataProvider;

/**
 * Created with IntelliJ IDEA.
 * User: Milia
 * Date:
 * Time: 12:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserDataProvider {
    @DataProvider(name = "CreateUser")
    public static Object[][] CreateUser() {
        return new Object[][]{
                {"Coquitlam", "admin", "manifieieva1111", "Felixxx", "password"},
                {"Coquitlam", "admin", "manifieieva1111", "", "password", "Mandatory field 'Username' is empty"},
                {"Coquitlam", "admin", "manifieieva1111", "Miaaaa", "","Mandatory field 'Password' is empty" }
        };
    }
}

