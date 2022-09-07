package samokatOrderTest;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.html5.WebStorage;
import pages.QuestionListObject;

import java.util.concurrent.TimeUnit;

public class MenuTest {
    private static WebDriver driver;

   //К сожалению, применениие   @BeforeClass и   @AfterClass нам показывали только на вебинаре)Но я попыталась
   @BeforeClass
    public static void setUp() {
       System.setProperty("webdriver.chrome.driver", "/Users/shandraan/Downloads/WebDriver/chromedriver 2");
       driver = new ChromeDriver();
       QuestionListObject questionListObject = new QuestionListObject(driver);
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       driver.get("https://qa-scooter.praktikum-services.ru/");
       questionListObject.clickCookie();
     }

//для браузера Firefox
 //   public void setUpFF() {
   //     System.setProperty("webdriver.gecko.driver","/Users/shandraan/Downloads/WebDriverFF/geckodriver");
  //      driver = new FirefoxDriver();}


    @Test
    public void checkFirstText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
     //  questionListObject.clickCookie();
        questionListObject.scrollAndCLick0();
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = questionListObject.getText0();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSecondText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
       // questionListObject.clickCookie();
        questionListObject.scrollAndCLick1();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = questionListObject.getText1();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkThirdText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
     //  questionListObject.clickCookie();
        questionListObject.scrollAndCLick2();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = questionListObject.getText2();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkFourthText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
      // questionListObject.clickCookie();
        questionListObject.scrollAndCLick3();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = questionListObject.getText3();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkFifthText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
      // questionListObject.clickCookie();
        questionListObject.scrollAndCLick4();
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = questionListObject.getText4();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSixText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
       // questionListObject.clickCookie();
        questionListObject.scrollAndCLick5();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = questionListObject.getText5();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSevenText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
      //  questionListObject.clickCookie();
        questionListObject.scrollAndCLick6();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = questionListObject.getText6();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkEightText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
      // questionListObject.clickCookie();
        questionListObject.scrollAndCLick7();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = questionListObject.getText7();
        Assert.assertEquals(expected, actual);
    }



   @After
    public void clearData(){
        driver.manage().deleteAllCookies();
      ((WebStorage) driver).getSessionStorage().clear();
        ((WebStorage) driver).getLocalStorage().clear();
   }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }


}






