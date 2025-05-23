package com.example.ultronproject

import com.example.ultronproject.screens.LazyListScreenPage
import com.example.ultronproject.ui.screens.LazyListScreen
import com.atiurin.ultron.core.compose.createDefaultUltronComposeRule
import org.junit.Rule
import org.junit.Test

class LazyListScreenTest {
    @get:Rule
    val composeRule = createDefaultUltronComposeRule()

    @Test
    fun testLazyListRendering() {
        composeRule.setContent { LazyListScreen() }

        LazyListScreenPage
            .assertScreenDisplayed()
            .assertItemText(0, "Item 0")
            .assertItemText(99, "Item 99")
    }

    @Test
    fun testScrollAndClick() {
        composeRule.setContent { LazyListScreen() }

        LazyListScreenPage
            .scrollToItem(50)
            .assertItemText(50, "Item 50")
            .clickItem(50)
    }
}
