package samokatOrderTest;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FirstOrderList;
import pages.SecondOrderList;

public class OrderScooterTest {
    private WebDriver driver;

    public OrderScooterTest() {

        System.setProperty("webdriver.chrome.driver", "/Users/shandraan/Downloads/WebDriver/chromedriver 2");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before
    public void setUp() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    //данные для тестов
    private final String name = "Вася";
    private final String surname = "Козлов";
    private final String adress = "Большая Черкизовская";
    private final String stationName = "Черкизовская";
    private final String phone = "89995437755";
    private final String date = "07.10.2022";
  


    @Test
    public void orderBlackSamokatTest() {
        FirstOrderList firstOrderList = new FirstOrderList(driver);
        firstOrderList.acceptCookie();
        firstOrderList.clickOrderButton();
        firstOrderList.fillName(name);
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
        Boolean actual = driver.findElement(By.xpath(".//div[text()='Хотите оформить заказ?']")).isDisplayed();
        Assert.assertEquals(true, actual);
    }

    @Test
    public void orderGreySamokatTest() {
        FirstOrderList firstOrderList = new FirstOrderList(driver);
        firstOrderList.acceptCookie();
        firstOrderList.clickOrderButton();
        firstOrderList.fillName(name);
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
        Boolean actual = driver.findElement(By.xpath(".//div[text()='Хотите оформить заказ?']")).isDisplayed();
        ;
        Assert.assertEquals(true, actual);
    }

    @After
    public void teardown() {

        driver.quit();
    }
}
