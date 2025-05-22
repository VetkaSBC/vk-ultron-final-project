package com.example.ultronproject.test.Pages
import androidx.compose.ui.test.hasText
import com.atiurin.ultron.extensions.assertExists
import com.atiurin.ultron.extensions.assertIsDisplayed
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.inputText

class ListScreenPage {
    fun enterText(name: String) {
        hasText("Введите запись").inputText(name)
    }

    fun clickAdd() {
        hasText("Добавить").click()
    }

    fun assertNameVisible(name: String) {
        hasText(name).assertIsDisplayed()
    }

    fun assertNameExists(name: String) {
        hasText(name).assertExists()
    }
}