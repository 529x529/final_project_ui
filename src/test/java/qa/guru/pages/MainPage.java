package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    LoginPage loginPage = new LoginPage();

    private SelenideElement

            mainPageLogo = $("#qa_header_custom_header .main-header__logo"),
            mainPageMenu = $("#qa_header_custom_header .main-header__menu"),
            personalAccountBtn = $(".main-header__login");

    @Step("Открываем главную страницу")
    public MainPage openPage() {
        open("");
        return this;
    }

    @Step("Проверяем отоброжение лого на главной странице")
    public MainPage checkMainPageLogo() {
        mainPageLogo.shouldBe(visible);
        return this;
    }

    @Step("Нажимаем на кнопку входа в личный кабинет")
    public LoginPage clickOnPersonalAccountBtn() {
        personalAccountBtn.click();
        return loginPage;
    }

    @Step("Открываем страницу выбранного курса")
    public void openCourseInMainMenu(String course) {
        mainPageMenu.$(byText(course)).click();
    }

}

