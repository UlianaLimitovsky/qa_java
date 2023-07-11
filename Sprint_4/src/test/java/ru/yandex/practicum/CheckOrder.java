package ru.yandex.practicum;
import org.junit.Assert;
import org.junit.Test;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
public class CheckOrder extends BaseUiTestOneSession {
     static final String NAME_1 = "Ульяна";
    private static final String SURNAME_1 = "Лимитовская";
    private static final String ADDRESS_1 = "Преображенская пл., 4";
    private static final String UNDERGROUND_1 = "Преображенская площадь";
    private static final String PHONE_1 = "89162650065";
    private static final String DATES_1 = "18.06.2023";
    private static final String COMMENT_1 = "Позвоните за 5 минут до приезда";
    private static final String NAME_2 = "     ";
    private static final String SURNAME_2 = "Иванова";
    private static final String ADDRESS_2 = "Открытое ш., 6";
    private static final String UNDERGROUND_2 = "Бульвар Рокоссовского";
    private static final String PHONE_2 = "+9955838363";
    private static final String DATES_2 = "18.06.2024";
    @Test
    public void checkOrderUpButton() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickOrderUpButton();
        OrderPage orderPage = new OrderPage(webDriver);
        mainPage.clickCookieButton();
        orderPage.inputName(NAME_1);
        orderPage.inputSurname(SURNAME_1);
        orderPage.inputAdress(ADDRESS_1);
        orderPage.inputUnderground(UNDERGROUND_1);
        orderPage.clickUnderground(orderPage.SelectorPreobrajenskaya);
        orderPage.inputPhone(PHONE_1);
        orderPage.clickButtonFurther();
        // Кнопка Далее
        orderPage.insertDates(DATES_1);
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickOneDay();
        // 1 день
        orderPage.clickBlackPearl();
        // Черный жемчуг
        orderPage.writeCommentСourier(COMMENT_1);
        orderPage.clickButtonOrderMiddle();
        // Заказать
        orderPage.clickYesButtonConfirmOrder();
        // Кнопка ДА
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
    }
    @Test
    public void checkOrderMiddleButton() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.clickOrderMiddleButton();
        OrderPage orderPage = new OrderPage(webDriver);
        orderPage.inputName(NAME_2);
        orderPage.inputSurname(SURNAME_2);
        orderPage.inputAdress(ADDRESS_2);
        orderPage.inputUnderground(UNDERGROUND_2);
        orderPage.clickUnderground(orderPage.SelectorRocossovskogo);
        orderPage.inputPhone(PHONE_2);
        orderPage.clickButtonFurther();
        orderPage.insertDates(DATES_2);
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickSevenDay();
        // 7 дней
        orderPage.clickGrayHopelessness();
        // Серая безысходность
        orderPage.clickButtonOrderMiddle();
        // Заказать
        orderPage.clickYesButtonConfirmOrder();
        // Кнопка ДА
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
    }
}