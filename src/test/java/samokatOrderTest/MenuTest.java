package samokatOrderTest;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuTest {

    private WebDriver driver;

    public MenuTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/shandraan/Downloads/WebDriver/chromedriver 2");
        driver = new ChromeDriver();
    }


    @Before
    public void setUp() {

        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void checkFirstText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
        driver.findElement(questionListObject.cookieButton).click();
        questionListObject.scrollToElement(questionListObject.heading0);
        questionListObject.clickToElement(questionListObject.heading0);
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actual = questionListObject.getText(questionListObject.accordion0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSecondText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
        driver.findElement(questionListObject.cookieButton).click();
        questionListObject.scrollToElement(questionListObject.heading1);
        questionListObject.clickToElement(questionListObject.heading1);
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = questionListObject.getText(questionListObject.accordion1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkThirdText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
        driver.findElement(questionListObject.cookieButton).click();
        questionListObject.scrollToElement(questionListObject.heading2);
        questionListObject.clickToElement(questionListObject.heading2);
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = questionListObject.getText(questionListObject.accordion2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkFourthText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
        driver.findElement(questionListObject.cookieButton).click();
        questionListObject.scrollToElement(questionListObject.heading3);
        questionListObject.clickToElement(questionListObject.heading3);
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = questionListObject.getText(questionListObject.accordion3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkFifthText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
        driver.findElement(questionListObject.cookieButton).click();
        questionListObject.scrollToElement(questionListObject.heading4);
        questionListObject.clickToElement(questionListObject.heading4);
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = questionListObject.getText(questionListObject.accordion4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSixText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
        driver.findElement(questionListObject.cookieButton).click();
        questionListObject.scrollToElement(questionListObject.heading5);
        questionListObject.clickToElement(questionListObject.heading5);
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = questionListObject.getText(questionListObject.accordion5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSevenText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
        driver.findElement(questionListObject.cookieButton).click();
        questionListObject.scrollToElement(questionListObject.heading6);
        questionListObject.clickToElement(questionListObject.heading6);
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = questionListObject.getText(questionListObject.accordion6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkEightText(){
        QuestionListObject questionListObject = new QuestionListObject(driver);
        driver.findElement(questionListObject.cookieButton).click();
        questionListObject.scrollToElement(questionListObject.heading7);
        questionListObject.clickToElement(questionListObject.heading7);
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = questionListObject.getText(questionListObject.accordion7);
        Assert.assertEquals(expected, actual);
    }

    @After
    public void teardown() {

        driver.quit();
    }

}






