package com.example.ultronproject.test

import com.atiurin.ultron.core.compose.createDefaultUltronComposeRule
import com.example.ultronproject.test.Pages.ClickerScreenPage
import com.example.ultronproject.ui.screens.ClickerScreen
import org.junit.Rule
import org.junit.Test

class ClickerTest {
    @get:Rule
    val composeRule = createDefaultUltronComposeRule()

    @Test
    fun clickerIncrementTest() {
        val clickerScreen = ClickerScreenPage()

        composeRule.setContent {
            ClickerScreen()
        }

        clickerScreen.assertCounterEquals(0)
        clickerScreen.clickIncrementButton()
        clickerScreen.assertCounterEquals(1)
        clickerScreen.clickIncrementButton()
        clickerScreen.assertCounterEquals(2)
    }

}