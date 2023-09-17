package qa.guru.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class JavaPlusCoursePage {

    private SelenideElement titleBlock = $("#ltBlock1560298965");

    @Step("Проверяем заголовок страницы выбранного круса")
    public void checkJavaPlusCoursePageTitle() {
        $(titleBlock).shouldHave(text("Автоматизация тестирования на Java Advanced"));
    }
}