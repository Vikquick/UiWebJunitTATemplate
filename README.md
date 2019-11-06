# UiWebJunitTATemplate
## Базовый проект для UI Web тестирования (JAVA 1.8)
### Фреймворки:
1) Junit4
2) Allure
3) Cucumber-JVM
4) Selenide
5) Selenoid
### Установка Selenoid
```
curl -s https://aerokube.com/cm/bash | bash \
&& ./cm selenoid start --vnc
```
### Запуск локально (Переменные browser и version на усмотрение, но те, что присутствуют в Selenoid)
```
mvn clean test -Dbrowser=chrome -Dversion=77.0
mvn allure:serve
```
