package com.example.ultronproject.test

import androidx.compose.ui.test.hasContentDescription
import androidx.compose.ui.test.hasText
import com.atiurin.ultron.core.compose.createDefaultUltronComposeRule
import com.atiurin.ultron.extensions.assertIsDisplayed
import com.atiurin.ultron.extensions.click
import com.example.ultronproject.AppWithDrawer
import org.junit.Rule
import org.junit.Test

class NavigationMenuTest {
    @get:Rule
    val composeRule = createDefaultUltronComposeRule()

    @Test
    fun navigationMenuIteratorTest() {
        composeRule.setContent {
            AppWithDrawer()
        }

        val menuItems = listOf(
            "Главная" to "Добро пожаловать!",
            "Кликер" to "Счётчик: 0",
            "Список" to "Введите запись",
            "Персональная информация" to "Фамилия"
        )

        menuItems.forEach { (itemTitle, itemText) ->
            hasContentDescription("меню").click()
            hasText(itemTitle).click()
            hasText(itemText).assertIsDisplayed()
        }
    }
}