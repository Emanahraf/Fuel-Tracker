import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FuelTrackerPage {
     WebDriver driver;
    public FuelTrackerPage(WebDriver driver) {

        this.driver=driver;

    }

    //page elements

    WebElement carNumber= driver.findElement(new By.ByName("carNumber"));
    WebElement fuelInLiters= driver.findElement(By.xpath("//input[@name=\"fuelInLiters\"]"));
     WebElement fuelCost=driver.findElement(By.xpath("//input[@name=\"fuelCost\"]"));
    WebElement fuelType=driver.findElement(By.xpath("//input[@name=\"fuelType\"]"));
    WebElement companyId=driver.findElement(By.xpath("//input[@name=\"companyId\"]"));
    WebElement dateAndTime=driver.findElement(By.xpath("//input[@name=\"dateAndTime\"]"));
    WebElement submitbtn=driver.findElement(By.cssSelector("button[class=\"btn btn-primary\"]"));

    //table
    @FindBy(xpath="//table/tbody/tr[1]/td[1]")
    public WebElement savedcarNumber;
    @FindBy(xpath="//table/tbody/tr[1]/td[2]")
    public WebElement savedfuelInLiters;
    @FindBy(xpath="//table/tbody/tr[1]/td[3]")
    public WebElement savedfuelCost;
    @FindBy(xpath="//table/tbody/tr[1]/td[4]")
    public WebElement savedfuelType;
    @FindBy(xpath="//table/tbody/tr[1]/td[5]")
    public WebElement saveddateAndTime;
    @FindBy(xpath="//table/tbody/tr[1]/td[6]")
    public WebElement savedcompanyId;

    public void EnterCarNumber(String number){
        carNumber.sendKeys(number);
    }
    public void EnterFuelInLiters(String FuelInLiters){
        fuelInLiters.sendKeys(FuelInLiters);
    }
    public void EnterFuelCost(String cost){
       fuelCost.sendKeys(cost);
    }
    public void EnterfuelType(String type){
      fuelType.sendKeys(type);
    }

    public void EnterDateAndTime(String Date){
     dateAndTime.sendKeys(Date);
    }
    public void EntercompanyId(String number){
        companyId.sendKeys(number);
    }
// submit function
public void Submit(){
    submitbtn.click();
}
    public String ReadsavedValue1(){
        String carno=savedcarNumber.getText();
     return  carno;
    }
    public String ReadsavedValue2(){
        String fuel=fuelInLiters.getText();
        return  fuel;
    }
    public String ReadsavedValue3(){
        String fuel=savedfuelInLiters.getText();
        return  fuel;
    }
    public String ReadsavedValue4(){
        String fuel=savedfuelCost.getText();
        return  fuel;
    }
    public String ReadsavedValue5(){
        String fuel=saveddateAndTime.getText();
        return  fuel;
    }
    public String ReadsavedValue6(){
        String fuel=savedcompanyId.getText();
        return  fuel;
    }
}
