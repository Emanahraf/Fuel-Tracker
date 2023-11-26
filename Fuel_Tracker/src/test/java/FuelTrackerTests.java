import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FuelTrackerTests {

    @Test
    public void Test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://hiring.petroapp.com/test2.html");
        driver.manage().window().maximize();
        // creat instance of class
        Thread.sleep(3000);
        FuelTrackerPage page =new FuelTrackerPage(driver);
        //enter vlaues
        page.EnterCarNumber("456EG");
        page.EnterFuelInLiters("6");
        page.EnterFuelCost("70");
        page.EnterfuelType("90");
        page.EnterDateAndTime("11/12/2023");
        page.EntercompanyId("56789");
        // click submit
        page.Submit();
//Read and compare result
         String carNumber=page.ReadsavedValue1();
        Assert.assertEquals(carNumber,"456EG");
        String FuelInLiters=page.ReadsavedValue2();

        Assert.assertEquals(FuelInLiters,"6");
        String fueltcost=page.ReadsavedValue3();
        Assert.assertEquals(fueltcost,"70");
        String fuelttype=page.ReadsavedValue4();
        Assert.assertEquals(fuelttype,"70");
        String Dateandtime=page.ReadsavedValue5();
        Assert.assertEquals(Dateandtime,"11/12/2023");
        String companyId=page.ReadsavedValue6();
        Assert.assertEquals(companyId,"56789");
driver.close();

    }

}
;