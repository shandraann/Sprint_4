package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class QuestionListObject {

    private WebDriver driver;

    public QuestionListObject(WebDriver driver) {
        this.driver = driver;
    }

    //    Локаторы для вопросов
    protected By heading0 = By.id("accordion__heading-0");
    protected By heading1 = By.id("accordion__heading-1");
    protected By heading2 = By.id("accordion__heading-2");
    protected By heading3 = By.id("accordion__heading-3");
    protected By heading4 = By.id("accordion__heading-4");
    protected By heading5 = By.id("accordion__heading-5");
    protected By heading6 = By.id("accordion__heading-6");
    protected By heading7 = By.id("accordion__heading-7");

    //    локаторы текста в вопросах
    protected By accordion0 = By.xpath("//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    protected By accordion1 = By.xpath("//p[text()='Пока что у нас так: один заказ — один самокат." +
            " Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");
    protected By accordion2 = By.xpath("//p[text()='Допустим, вы оформляете заказ на 8 мая." +
            " Мы привозим самокат 8 мая в течение дня." +
            " Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру." +
            " Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");
    protected By accordion3 = By.xpath("//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    protected By accordion4 = By.xpath("//p[text()='Пока что нет!" +
            " Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");
    protected By accordion5 = By.xpath("//p[text()='Самокат приезжает к вам с полной зарядкой." +
            " Этого хватает на восемь суток — даже если будете кататься без передышек и во сне." +
            " Зарядка не понадобится.']");
    protected By accordion6 = By.xpath("//p[text()='Да, пока самокат не привезли." +
            " Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    protected By accordion7 = By.xpath("//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");
    protected By cookieButton = By.xpath("//button[text()='да все привыкли']");
    //cookie


    //   скролл и клик до элемента
    public void scrollAndCLick0() {
        WebElement element = driver.findElement(heading0);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(heading0).click();

    }

    //    метод получения текста из выпадающего поля
    public String getText0() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(accordion0));
        return driver.findElement(accordion0).getText();
    }

    public void scrollAndCLick1() {
        WebElement element = driver.findElement(heading1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(heading1).click();

    }

    public String getText1() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(accordion1));
        return driver.findElement(accordion1).getText();
    }

    public void scrollAndCLick2() {
        WebElement element = driver.findElement(heading2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(heading2).click();

    }

    public String getText2() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(accordion2));
        return driver.findElement(accordion2).getText();
    }

    public void scrollAndCLick3() {
        WebElement element = driver.findElement(heading3);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(heading3).click();

    }

    public String getText3() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(accordion3));
        return driver.findElement(accordion3).getText();
    }

    public void scrollAndCLick4() {
        WebElement element = driver.findElement(heading4);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(heading4).click();

    }

    public String getText4() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(accordion4));
        return driver.findElement(accordion4).getText();
    }

    public void scrollAndCLick5() {
        WebElement element = driver.findElement(heading5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(heading5).click();

    }

    public String getText5() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(accordion5));
        return driver.findElement(accordion5).getText();
    }

    public void scrollAndCLick6() {
        WebElement element = driver.findElement(heading6);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(heading6).click();

    }

    public String getText6() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(accordion6));
        return driver.findElement(accordion6).getText();
    }

    public void scrollAndCLick7() {
        WebElement element = driver.findElement(heading7);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(heading7).click();

    }

    public String getText7() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(accordion7));
        return driver.findElement(accordion7).getText();
    }

    public void clickCookie() {
        driver.findElement(cookieButton).click();
    }



}







//     клик по элементу
//  public void clickToElement(By by) {
//  scrollToElement(by);
//  driver.findElement(by).click();}
