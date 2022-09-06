package samokatOrderTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FirstOrderList {

    private WebDriver driver;

    public FirstOrderList(WebDriver driver) {

        this.driver = driver;
    }
    protected By cookieButton = By.xpath("//button[text()='да все привыкли']");
    //кнопка Заказать (вверху страницы)
    protected By orderButton = By.className("Button_Button__ra12g");
    protected By namePlace = By.xpath(".//input[@placeholder='* Имя']");
    protected By surnamePlace = By.xpath(".//input[@placeholder='* Фамилия']");
    protected By adressPlace = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    protected By metroPlace = By.xpath(".//input[@placeholder='* Станция метро']");
    // protected By metroStation = By.xpath(".//div[text()='Бульвар Рокоссовского']");
    private String stationItem = ".//div[text()='%s']/..";

    protected By phonePlace = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    protected By further = By.xpath("//button[text()='Далее']");


    // Нажать кнопку Заказать
    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    //Ввести Имя
    public void fillName(String Name) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(namePlace).click();
        driver.findElement(namePlace).sendKeys(Name);
    }


    //Ввести фамилию
    public void fillSurname(String surname) {
        driver.findElement(surnamePlace).click();
        driver.findElement(surnamePlace).sendKeys(surname);
    }

    //Ввести Адрес
    public void fillAdress(String adress) {
        driver.findElement(adressPlace).click();
        driver.findElement(adressPlace).sendKeys(adress);
    }


    //Выбрать станцию метро
    public void chooseMetroStation (String stationName){
        driver.findElement(metroPlace).click();
        driver.findElement(metroPlace).sendKeys(stationName);
        driver.findElement(By.xpath(String.format(stationItem, stationName))).click();

    }


    //Вводим номер телефона
    public void fillPhone(String phone) {
        driver.findElement(phonePlace).click();
        driver.findElement(phonePlace).sendKeys(phone);
    }

    //Нажимаем кнопку Далее
    public void clickFurther(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(further).click();
    }


}







