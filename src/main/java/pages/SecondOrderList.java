package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SecondOrderList {
    private WebDriver driver;

    public SecondOrderList(WebDriver driver) {

        this.driver = driver;
    }

    protected By datePlace = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    protected By dropDownButton = By.className("Dropdown-arrow");
    protected By durationOfRent = By.xpath(".//div[text()='сутки']");
    protected By blackScooter = By.id("black");
    protected By greyScooter = By.id("grey");
    protected By orderFinishButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text()='Заказать']");
    protected By orderConfirmButton = By.xpath(".//button[text()='Да']");
    protected By orderSuccesButton = By.xpath(".//div[text()='Заказ оформлен']");


    //Когда привезти самокат
    public void chooseDate(String date) {
        driver.findElement(datePlace).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(datePlace).sendKeys(date);
    }
    //Выбрать срок аренды
    public void chooseDuration(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(dropDownButton).click();
        driver.findElement(durationOfRent).click();
    }
    // Выбрать черный самокат
    public void chooseBlackScooter(){
        driver.findElement(blackScooter).click();
    }
    // Выбрать серый самокат
    public void chooseGreyScooter(){

        driver.findElement(greyScooter).click();
    }
    //Нажать Заказать
    public void finishOrder(){
        driver.findElement(orderFinishButton).click();
       new WebDriverWait(driver, 3)
               .until(ExpectedConditions.elementToBeClickable(orderConfirmButton));
       driver.findElement(orderConfirmButton).click();
    }

    public boolean checkOrderSucces () {
        driver.findElement(orderSuccesButton).isDisplayed();
        return true;
    }

}


