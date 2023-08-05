package qa.guru.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import qa.guru.pages.LoginPage;
import qa.guru.pages.MainPage;

public class BaseTest {

    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();


    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://www.lamoda.ru";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;

    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}
