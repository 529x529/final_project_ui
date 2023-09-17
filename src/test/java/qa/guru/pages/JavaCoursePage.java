package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class JavaCoursePage {

    private SelenideElement titleBlock = $("#ltBlock1543870559");

    @Step("Проверяем заголовок страницы выбранного круса")
    public void checkJavaCoursePageTitle() {
        $(titleBlock).shouldHave(text("Школа инженеров по автоматизации тестирования на Java"));
    }
}
