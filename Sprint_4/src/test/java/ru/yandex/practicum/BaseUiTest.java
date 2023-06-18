package ru.yandex.practicum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseUiTest {
    protected WebDriver webDriver;

//    @Before
//    public void setUp() {
//        WebDriverManager.firefoxdriver().setup();
//        webDriver = new FirefoxDriver();
//        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        webDriver.get("https://qa-scooter.praktikum-services.ru");
//    }

//    @Before
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        webDriver = new ChromeDriver();
//        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        webDriver.get("https://qa-scooter.praktikum-services.ru");
//    }

    @Before
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        webDriver = new EdgeDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.get("https://qa-scooter.praktikum-services.ru");
    }

    @After
    public void tearDown () {
        webDriver.quit();
    }
    }

