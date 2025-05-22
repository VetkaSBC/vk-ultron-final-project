package com.example.ultronproject.test.Pages

import androidx.compose.ui.test.hasText
import com.atiurin.ultron.extensions.assertIsDisplayed
import com.atiurin.ultron.extensions.click

class ClickerScreenPage {
    fun assertCounterEquals(value: Int) {
        hasText("Счётчик: $value").assertIsDisplayed()
    }

    fun clickIncrementButton() {
        hasText("Нажми меня").click()
    }
}