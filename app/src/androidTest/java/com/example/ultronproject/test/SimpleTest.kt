package com.example.ultronproject.test

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.ui.test.hasText
import com.atiurin.ultron.core.compose.createDefaultUltronComposeRule
import com.atiurin.ultron.extensions.assertIsDisplayed
import com.example.ultronproject.ui.screens.GreetingScreen
import org.junit.Rule
import org.junit.Test


class SimpleTest {
    @get:Rule
    val composeRule = createDefaultUltronComposeRule()

    @Test
    fun simpleTest() {
       composeRule.setContent {
           GreetingScreen()
       }

        hasText("Добро пожаловать!").assertIsDisplayed()
    }
}