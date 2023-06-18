package ru.yandex.practicum;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected final WebDriver webDriver;

    public BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
