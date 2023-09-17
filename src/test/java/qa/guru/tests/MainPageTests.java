package qa.guru.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTests extends BaseTest {

    @Test
    @DisplayName("Проверка открытия главной страницы qa.guru ")
    void successfulOpenManePageTest() {
        mainPage.openPage().checkMainPageLogo();
    }

    @Test
    @DisplayName("В главном меню есть курс по Java+")
    void inMainMenuShoudBeJavaPlusCourseTest() {
        mainPage.openPage().openCourseInMainMenu("Курсы Java+");
        javaPlusCoursePage.checkJavaPlusCoursePageTitle();
    }

    @Test
    @DisplayName("В главном меню есть курс по Python")
    void inMainMenuShoudBePythonCourseTest() {
        mainPage.openPage().openCourseInMainMenu("Курсы Python");
        pythonCoursePage.checkPythonCoursePageTitle();
    }

    @Test
    @DisplayName("При открытии главной страницы qa.guru открывается страница курса по Java")
    void inMainMenuShoudBeJavaCourseTest() {
        mainPage.openPage();
        javaCoursePage.checkJavaCoursePageTitle();
    }
}
