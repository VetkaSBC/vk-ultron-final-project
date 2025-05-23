# Ultron tests

Этот проект включает в себя демонстрационное Android-приложение, созданное с использованием **Jetpack Compose**. Включает в себя несколько экранов с различной функциональностью:

- Приветственный экран
- Счётчик кликов
- Список с возможностью добавления записей
- Форма для ввода персональных данных
- Экран, отображающий вертикальный список из 100 элементов

Приложение сопровождается набором **UI-тестов**, написанных с использованием фреймворка **[Ultron](https://github.com/open-tool/ultron)**.

---

## Структура проекта

```
UltronProject/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   └── java/com/example/ultronproject/
│   │   │        ├── ui/
│   │   │        │   ├── screens/          # Экраны приложения
│   │   │        │   └── theme/ 
│   │   │        └── MainActivity.kt       # Главная Activity                            
│   │   └── androidTest/
│   │       └── java/com/example/ultronproject/test/
│   │           ├── Pages/                 # Page Objects
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
- **LazyListScreen** - экран, отображающий вертикальный список из 100 элементов с использованием LazyColumn. Каждый элемент представлен карточкой (Card) с текстом Item N, где N — позиция элемента в списке.

---

## Тестовая инфраструктура

Тесты находятся в пакете `com.example.ultronproject.test` и используют:

- **[Ultron](https://github.com/open-tool/ultron)** — фреймворк для тестирования android-приложений
- **[Allure](https://docs.qameta.io/allure/)** — фреймворк для генерации детализированных отчётов
- **Page Object Pattern** — архитектурный паттерн для организации тестов

---

## Настройка и запуск

### Предварительные требования

Перед запуском проекта убедитесь, что у вас установлены следующие компоненты:

- **Android Studio**  
  Скачать: [https://developer.android.com/studio](https://developer.android.com/studio)
- **JDK 11+**  
  Скачать: [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)
- **Gradle** (необязательно, если используете Android Studio с Gradle Wrapper)  
  Скачать: [https://gradle.org/install/](https://gradle.org/install/)
- Устройство или эмулятор Android с API 26+  
  Документация: [AVD Manager](https://developer.android.com/studio/run/managing-avds)


### Запуск тестов

- В Android Studio:  
  ПКМ на папке `test` → `Run all tests`

- Через командную строку:
    ```bash
    ./gradlew connectedAndroidTest
    ```

