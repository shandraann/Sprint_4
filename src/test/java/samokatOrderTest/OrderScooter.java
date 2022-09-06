package samokatOrderTest;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderScooter {
    private WebDriver driver;

    public OrderScooter() {

        System.setProperty("webdriver.chrome.driver", "/Users/shandraan/Downloads/WebDriver/chromedriver 2");
        driver = new ChromeDriver();
    }

    @Before
    public void setUp() {

        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    //данные для тестов
    private final String Name = "Вася";
    private final String surname = "Козлов";
    private final String adress = "Большая Черкизовская";
    private final String stationName = "Черкизовская";
    private final String phone = "89995437755";
    private final String date = "07.10.2022";





    @Test
    public void orderBlackSamokatTest() {
        FirstOrderList firstOrderList = new FirstOrderList(driver);
        driver.findElement(firstOrderList.cookieButton).click();
        firstOrderList.clickOrderButton();
        firstOrderList.fillName(Name);
        firstOrderList.fillSurname(surname);
        firstOrderList.fillAdress(adress);
        firstOrderList.chooseMetroStation(stationName);
        firstOrderList.fillPhone(phone);
        firstOrderList.clickFurther();
        SecondOrderList secondOrderList = new SecondOrderList(driver);
        secondOrderList.chooseDate(date);
        secondOrderList.chooseDuration();
        secondOrderList.chooseBlackScooter();
        secondOrderList.finishOrder();
    }

    @Test
    public void orderGreySamokatTest() {
        FirstOrderList firstOrderList = new FirstOrderList(driver);
        driver.findElement(firstOrderList.cookieButton).click();
        firstOrderList.clickOrderButton();
        firstOrderList.fillName(Name);
        firstOrderList.fillSurname(surname);
        firstOrderList.fillAdress(adress);
        firstOrderList.chooseMetroStation(stationName);
        firstOrderList.fillPhone(phone);
        firstOrderList.clickFurther();
        SecondOrderList secondOrderList = new SecondOrderList(driver);
        secondOrderList.chooseDate(date);
        secondOrderList.chooseDuration();
        secondOrderList.chooseGreyScooter();
        secondOrderList.finishOrder();
    }

    @After
    public void teardown() {

        driver.quit();
    }
}
