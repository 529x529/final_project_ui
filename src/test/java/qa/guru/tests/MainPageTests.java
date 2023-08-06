package qa.guru.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTests extends BaseTest {

    @Test
    @DisplayName("Проверка открытия главной страницы qa.guru ")
    void successfulOpenManePageTest() {
        mainPage
                .openPage()
                .checkMainPageLogo();
    }

    @Test
    @DisplayName("В главном меню есть курс по Java+")
    void inMainMenuShoudBeJavaPlusCourseTest() {
        mainPage
                .openPage()
                .checkCourseInMainMenu("Курсы Java+");

    }

    @Test
    @DisplayName("В главном меню есть курс по Python")
    void inMainMenuShoudBePythonCourseTest() {
        mainPage
                .openPage()
                .checkCourseInMainMenu("Курсы Python");

    }

    @Test
    @DisplayName("Переход на страницу авторизации при нажатии на кнопку входа в личный кабинет")
    void moveToLoginPageTest() {
        mainPage
                .openPage()
                .clickOnPersonalAccountBtn();
        loginPage
                .checkThatAutorizationFormOpened();
    }

    @Test
    @DisplayName("Проверка открытия регистрационной формы со страницы авторизации")
    void openRegistrationForm() {
        mainPage
                .openPage()
                .clickOnPersonalAccountBtn();
        loginPage
                .checkThatAutorizationFormOpened()
                .clickRegistrationBtn()
                .checkThatRegistrationFormOpened();
    }
}
