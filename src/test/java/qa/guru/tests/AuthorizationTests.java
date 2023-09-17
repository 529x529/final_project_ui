package qa.guru.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthorizationTests extends BaseTest {
    @Test
    @DisplayName("Переход на страницу авторизации при нажатии на кнопку входа в личный кабинет")
    void moveToLoginPageTest() {
        mainPage.openPage().clickOnPersonalAccountBtn();
        loginPage.checkThatAutorizationFormOpened();
    }

    @Test
    @DisplayName("Проверка открытия регистрационной формы со страницы авторизации")
    void openRegistrationFormTest() {
        mainPage.openPage().clickOnPersonalAccountBtn();
        loginPage.checkThatAutorizationFormOpened().clickRegistrationBtn().checkThatRegistrationFormOpened();
    }

    @Test
    @DisplayName("При нажатии на лого на странице авторизации происходит переход на главную страницу")
    void openMainPageAfterClickLogo() {
        mainPage.openPage().clickOnPersonalAccountBtn();
        loginPage.clickLoginPageLogo();
        mainPage.checkMainPageLogo();
    }
}
