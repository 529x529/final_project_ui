package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PythonCoursePage {

    private SelenideElement titleBlock = $("#ltBlock1550571527");

    @Step("Проверяем заголовок страницы выбранного круса")
    public void checkPythonCoursePageTitle() {
        $(titleBlock).shouldHave(text("Курс инженеров по автоматизации тестирования на Python"));
    }
}
