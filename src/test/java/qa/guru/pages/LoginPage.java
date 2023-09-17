package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    SelenideElement registrationBtn = $("#xdget51950_1");

    @Step("Нажимаем на кнопку регистрации")
    public LoginPage clickRegistrationBtn() {
        registrationBtn.click();
        return this;
    }

    @Step("Проверяем, что открыта форма авторизации")
    public LoginPage checkThatAutorizationFormOpened() {
        $("#xdget172046_1").shouldHave(text("Войти"));
        return this;
    }

    @Step("Проверяем, что открыта форма регистрации")
    public LoginPage checkThatRegistrationFormOpened() {
        $("#xdget89548_1").shouldHave(text("Регистрация"));
        return this;
    }
}
