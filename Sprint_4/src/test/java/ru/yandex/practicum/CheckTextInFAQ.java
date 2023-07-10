package ru.yandex.practicum;

import org.junit.Assert;
import org.junit.Test;

public class CheckTextInFAQ extends BaseUiTestOneSession {

    @Test
    public void CheckTextOneInFAQ() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion0();
        String expected = "Сколько это стоит? И как оплатить?";
        String actual = mainPage.getText0();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CheckTextTwoInFAQ() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion1();
        String expected = "Хочу сразу несколько самокатов! Так можно?";
        String actual = mainPage.getText1();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CheckTextThreeInFAQ() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion2();
        String expected = "Как рассчитывается время аренды?";
        String actual = mainPage.getText2();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CheckTextFourInFAQ() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion3();
        String expected = "Можно ли заказать самокат прямо на сегодня?";
        String actual = mainPage.getText3();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CheckTextFiveInFAQ() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion4();
        String expected = "Можно ли продлить заказ или вернуть самокат раньше?";
        String actual = mainPage.getText4();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CheckTextSixInFAQ() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion5();
        String expected = "Вы привозите зарядку вместе с самокатом?";
        String actual = mainPage.getText5();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CheckTextSevenInFAQ() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion6();
        String expected = "Можно ли отменить заказ?";
        String actual = mainPage.getText6();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void CheckTextEightInFAQ() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion7();
        String expected = "Я жизу за МКАДом, привезёте?";
        String actual = mainPage.getText7();
        Assert.assertEquals(expected, actual);
    }
} 
