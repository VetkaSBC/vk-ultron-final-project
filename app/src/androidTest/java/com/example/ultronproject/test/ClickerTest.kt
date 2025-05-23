package com.example.ultronproject.test

import com.atiurin.ultron.allure.step.step
import com.atiurin.ultron.core.compose.createDefaultUltronComposeRule
import com.example.ultronproject.test.Pages.ClickerScreenPage
import com.example.ultronproject.ui.screens.ClickerScreen
import org.junit.Rule
import org.junit.Test


class ClickerTest : BaseTest() {
    @get:Rule
    val composeRule = createDefaultUltronComposeRule()

    @Test
    fun clickerIncrementTest() {
        val clickerScreen = ClickerScreenPage()

        step("Открываем экран") {
            composeRule.setContent {
                ClickerScreen()
            }
        }

        step("Проверяем счётчик 0") {
            clickerScreen.assertCounterEquals(0)
        }

        step("Нажимаем кнопку → счётчик 1") {
            clickerScreen.clickIncrementButton()
            clickerScreen.assertCounterEquals(1)
        }

        step("Нажимаем кнопку → счётчик 2") {
            clickerScreen.clickIncrementButton()
            clickerScreen.assertCounterEquals(2)
        }
    }
}