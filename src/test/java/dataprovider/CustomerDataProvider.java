package dataprovider;


import org.testng.annotations.DataProvider;

/**
 * Created with IntelliJ IDEA.
 * User: Milia
 * Date:
 * Time: 12:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerDataProvider {
    @DataProvider(name = "CreateCustomer")
    public static Object[][] CreateCustomer()
    {
        return new Object[][]{
                {"Coquitlam", "admin", "manifieieva1111", "Super", "Power"},
                {"Coquitlam", "admin", "manifieieva1111", "", "Lucy", "Mandatory field 'First Name' is empty"},
                {"Coquitlam", "admin", "manifieieva1111", "Fox", "", "Mandatory field 'Last Name' is empty"},

        };
    }
}

