package ru.yandex.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    // Локаторы

    // Кнопка принятия cookie
    protected By cookieButton = By.id("rcc-confirm-button");
    // Вопрос 1 "Сколько это стоит? И как оплатить?"
    protected By question0 = By.id("accordion__heading-0");
    // Вопрос 2 "Хочу сразу несколько самокатов! Так можно?"
    protected By question1 = By.id("accordion__heading-1");
    // Вопрос 3 "Как рассчитывается время аренды?"
    protected By question2 = By.id("accordion__heading-2");
    // Вопрос 4 "Можно ли заказать самокат прямо на сегодня?"
    protected By question3 = By.id("accordion__heading-3");
    // Вопрос 5 "Можно ли продлить заказ или вернуть самокат раньше?"
    protected By question4 = By.id("accordion__heading-4");
    // Вопрос 6 "Вы привозите зарядку вместе с самокатом?"
    protected By question5 = By.id("accordion__heading-5");
    // Вопрос 7 "Можно ли отменить заказ?"
    protected By question6 = By.id("accordion__heading-6");
    // Вопрос 8 "Я жизу за МКАДом, привезёте?"
    protected By question7 = By.id("accordion__heading-7");
    // Кнопка "Заказать" наверху
    protected By orderUpButton = By.className("Button_Button__ra12g");
    // Кнопка "Заказать" снизу
    protected By orderMiddleButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

//    public void open() {
//        webDriver.get("https://qa-scooter.praktikum-services.ru");
//    }

    public void clickCookieButton () {
    webDriver.findElement(cookieButton).click();
}

    public void scrollToQuestion () {
        WebElement element = webDriver.findElement(question0);
        ((JavascriptExecutor)webDriver).executeScript("arguments[0].scrollIntoView();",element);
    }

    public void clickQuestion (By text) {
        webDriver.findElement(text).click();
    }

    public String getText(By text) {
        return webDriver.findElement(text).getText();
    }

    public void clickOrderUpButton () {
        webDriver.findElement(orderUpButton).click();
    }

    public void clickOrderMiddleButton () {
        webDriver.findElement(orderMiddleButton).click();
    }



}



