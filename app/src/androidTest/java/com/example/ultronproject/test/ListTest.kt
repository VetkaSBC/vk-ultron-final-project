package com.example.ultronproject.test

import com.atiurin.ultron.core.compose.createDefaultUltronComposeRule
import com.example.ultronproject.test.Pages.ListScreenPage
import com.example.ultronproject.ui.screens.ListScreen
import org.junit.Rule
import org.junit.Test

class ListTest {
    @get:Rule
    val composeRule = createDefaultUltronComposeRule()

    @Test
    fun addTextOnce() {
        val screen = ListScreenPage()

        composeRule.setContent {
            ListScreen()
        }

        val text = "ЗаПиСь нОмЕр 234235234234231"
        screen.enterText(text)
        screen.clickAdd()
        screen.assertNameExists(text)

        screen.assertNameExists("ЗаПиСь нОмЕр 234235234234231")
    }

    @Test
    fun addTextMany() {
        val screen = ListScreenPage()

        composeRule.setContent {
            ListScreen()
        }

        repeat(40) {
            val text = "ЗаПиСь нОмЕр $it"
            screen.enterText(text)
            screen.clickAdd()
            screen.assertNameExists(text)
        }

        screen.assertNameExists("ЗаПиСь нОмЕр 38")
    }
}