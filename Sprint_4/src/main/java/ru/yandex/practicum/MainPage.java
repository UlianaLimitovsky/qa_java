package ru.yandex.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    // Локаторы

    // Кнопка принятия cookie
    private By cookieButton = By.id("rcc-confirm-button");
    // Вопрос 1 "Сколько это стоит? И как оплатить?"
    private By question0 = By.id("accordion__heading-0");
    // Вопрос 2 "Хочу сразу несколько самокатов! Так можно?"
    private By question1 = By.id("accordion__heading-1");
    // Вопрос 3 "Как рассчитывается время аренды?"
    private By question2 = By.id("accordion__heading-2");
    // Вопрос 4 "Можно ли заказать самокат прямо на сегодня?"
    private By question3 = By.id("accordion__heading-3");
    // Вопрос 5 "Можно ли продлить заказ или вернуть самокат раньше?"
    private By question4 = By.id("accordion__heading-4");
    // Вопрос 6 "Вы привозите зарядку вместе с самокатом?"
    private By question5 = By.id("accordion__heading-5");
    // Вопрос 7 "Можно ли отменить заказ?"
    private By question6 = By.id("accordion__heading-6");
    // Вопрос 8 "Я жизу за МКАДом, привезёте?"
    private By question7 = By.id("accordion__heading-7");
    // Кнопка "Заказать" наверху
    private By orderUpButton = By.className("Button_Button__ra12g");
    // Кнопка "Заказать" снизу
    private  By orderMiddleButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

//    public void open() {
//        webDriver.get(BASE_URL);
//    }

    public void clickCookieButton () {
    webDriver.findElement(cookieButton).click();
}
    public void scrollToQuestion () {
        WebElement element = webDriver.findElement(question0);
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();",element);
    }
    public void clickQuestion0 () {
        webDriver.findElement(question0).click();
    }
    public void clickQuestion1 () {
        webDriver.findElement(question1).click();
    }
    public void clickQuestion2 () {
        webDriver.findElement(question2).click();
    }
    public void clickQuestion3 () {
        webDriver.findElement(question3).click();
    }
    public void clickQuestion4 () {
        webDriver.findElement(question4).click();
    }
    public void clickQuestion5 () {
        webDriver.findElement(question5).click();
    }
    public void clickQuestion6 () {
        webDriver.findElement(question6).click();
    }
    public void clickQuestion7 () { webDriver.findElement(question7).click();}




    public void clickQuestion (By text) {
        webDriver.findElement(text).click();
    }

    public String getText0() {
        return webDriver.findElement(question0).getText();
    }
    public String getText1() {
        return webDriver.findElement(question1).getText();
    }
    public String getText2() {
        return webDriver.findElement(question2).getText();
    }
    public String getText3() {
        return webDriver.findElement(question3).getText();
    }
    public String getText4() {
        return webDriver.findElement(question4).getText();
    }
    public String getText5() {
        return webDriver.findElement(question5).getText();
    }
    public String getText6() {
        return webDriver.findElement(question6).getText();
    }
    public String getText7() {
        return webDriver.findElement(question7).getText();
    }


    public void clickOrderUpButton () {
        webDriver.findElement(orderUpButton).click();
    }

    public void clickOrderMiddleButton () {
        webDriver.findElement(orderMiddleButton).click();
    }



}



