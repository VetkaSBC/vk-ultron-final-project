# UltronProject

**UltronProject** включает в себя демонстрационное Android-приложение, созданное с использованием **Jetpack Compose**. Включает в себя несколько экранов с различной функциональностью:

- Приветственный экран
- Счётчик кликов
- Список с возможностью добавления записей
- Форма для ввода персональных данных

Приложение сопровождается набором **UI-тестов**, написанных с использованием фреймворка **Ultron**.

---

## Структура проекта

```
UltronProject/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   └── java/com/example/ultronproject/
│   │   │        ├── ui/
│   │   │        │   ├── screens/     # Экраны приложения
│   │   │        │   └── theme/ 
│   │   │        └── MainActivity.kt  # Главная Activity                            
│   │   └── androidTest/
│   │       └── java/com/example/ultronproject/test/
│   │           ├── Pages/            # Page Objects
│   │           ├── BaseTest.kt         
│   │           ├── ClickerTest.kt                 
│   │           ├── ListTest.kt                   
│   │           ├── NavigationMenuTest.kt           
│   │           ├── PersonalTest.kt                 
│   │           └── SimpleTest.kt                   
│   └── build.gradle                        # Конфигурация модуля app
├── gradle/
├── build.gradle                            # Основной build.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle                          # Настройки проекта
└── README.md                                # Документация
```

### Основные экраны

- **GreetingScreen** — простой приветственный экран с текстом "Добро пожаловать!"
- **ClickerScreen** — экран счётчика с кнопкой для увеличения значения
- **ListScreen** — экран для добавления и отображения списка текстовых записей
- **PersonalScreen** — форма для ввода и отображения персональных данных (имя, фамилия, отчество)

---

## Тестовая инфраструктура

Тесты находятся в пакете `com.example.ultronproject.test` и используют:

- **Ultron** — фреймворк для тестирования android-приложений
- **Allure** — генерация детализированных отчётов
- **Page Object Pattern** — архитектурный паттерн для организации тестов

---

## Настройка и запуск

### Предварительные требования

- Android Studio
- JDK 11 или выше
- Устройство или эмулятор Android

### Запуск тестов

- В Android Studio:  
  ПКМ на папке `test` → `Run all tests`

- Через командную строку:
    ```bash
    ./gradlew connectedAndroidTest
    ```

