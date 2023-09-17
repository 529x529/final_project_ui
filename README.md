# Проект по автоматизации тестирования UI сайта qa.guru

### Технологии и инструменты:
<p align="center">
<img src="images/logos/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/>
<img src="images/logos/Java.svg" width="50" height="50"  alt="Java"/>
<img src="images/logos/Github.svg" width="50" height="50"  alt="Github"/>
<img src="images/logos/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/>
<img src="images/logos/Gradle.svg" width="50" height="50"  alt="Gradle"/>
<img src="images/logos/Selenide.svg" width="50" height="50"  alt="Selenide"/>
<img src="images/logos/Selenoid.svg" width="50" height="50"  alt="Selenoid"/>
<img src="images/logos/Allure_Report.svg" width="50" height="50"  alt="Allure_Report"/>
<img src="images/logos/Jenkins.svg" width="50" height="50"  alt="Jenkins"/>
</p>

### Реализованные проверки:
* Проверка открытия главной страницы qa.guru
* Переход на страницу авторизации при нажатии на кнопку входа в личный кабинет
* Проверка открытия регистрационной формы со страницы авторизации
* Проверка, что в главном меню есть курс по Java+
* Проверка, что в главном меню есть курс по Python
* Проверка отсутствия ошибок в логах консоли

### Запуск тестов из терминала
#### Локальный запуск тестов:
```bash
gradle clean test
```

#### Удаленный запуск тестов с параметрами:

```bash
gradle clean test
-Dbrowser=${BROWSER}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserVersion=${BROWSER_VERSION}
-DbaseUrl=${BASE_URL}
-Dselenoid=${SELENOID}
```
где: 

- <code>BROWSER</code> – браузер, в котором будут выполняться тесты;
- <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты;
- <code>BROWSER_VERSION</code> – версия браузера, в которой будут выполняться тесты;
- <code>BASE_URL</code> – адрес сайта;
- <code>SELENOID</code> - Логин, пароль и адрес удаленного сервера Selenoid на котором будут запускаться тесты.

### Сборка в [Jenkins](https://jenkins.autotests.cloud/job/rezchikov_qa.guru_tests)
<p align="center">
<img title="Jenkins Build" src="images/screens/Jenkins.png">
</p>

### Отчет в [Allure report](https://jenkins.autotests.cloud/job/rezchikov_qa.guru_tests/7/allure/)
#### Основная страница отчета
<p align="center">
<img title="Jenkins Build" src="images/screens/Allure-report.png">
</p>

#### Тест-кейсы
<p align="center">
<img title="Jenkins Build" src="images/screens/Allure-tests.png">
</p>

### Уведомления в Telegram с использованием бота
<p align="center">
<img title="Jenkins Build" src="images/screens/Telegram.png">
</p>

### Пример видео выполнения теста на Selenoid
<p align="center">
  <img title="Selenoid Video" src="images/screens/Video.gif">
</p>
