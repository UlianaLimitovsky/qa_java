package ru.yandex.practicum;

import org.junit.Assert;
import org.junit.Test;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class checkOrder extends BaseUiTest_one_session {

    @Test
    public void checkOrderUpButton() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOrderUpButton();
        OrderPage orderPage = new OrderPage(webDriver);
        mainPage.clickCookieButton();
        orderPage.inputName("Ульяна");
        orderPage.inputSurname("Лимитовская");
        orderPage.inputAdress("Преображенская пл., 4");
        orderPage.inputUnderground("Преображенская площадь");
        orderPage.clickUnderground(orderPage.SelectorPreobrajenskaya);
        orderPage.inputPhone("89162650065");
        orderPage.clickButtonFurther(); // Кнопка Далее
        orderPage.insertDates("18.06.2023");
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickOneDay(); // 1 день
        orderPage.clickBlackPearl(); // Черный жемчуг
        orderPage.writeCommentСourier("Позвоните за 5 минут до приезда");
        orderPage.clickButtonOrderMiddle(); // Заказать
        orderPage.clickYesButtonConfirmOrder(); // Кнопка ДА
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
    }

    @Test
    public void checkOrderMiddleButton() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.clickOrderMiddleButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.inputName("     ");
        orderPage.inputSurname("Иванова");
        orderPage.inputAdress("Открытое ш., 6");
        orderPage.inputUnderground("Бульвар Рокоссовского");
        orderPage.clickUnderground(orderPage.SelectorRocossovskogo);
        orderPage.inputPhone("+9955838363");
        orderPage.clickButtonFurther();
        orderPage.insertDates("18.06.2024");
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickSevenDay(); // 7 дней
        orderPage.clickGrayHopelessness(); // Серая безысходность
        orderPage.clickButtonOrderMiddle(); // Заказать
        orderPage.clickYesButtonConfirmOrder(); // Кнопка ДА
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
    }

}
