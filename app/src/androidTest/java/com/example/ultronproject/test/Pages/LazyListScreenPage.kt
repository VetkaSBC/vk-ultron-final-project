package com.example.ultronproject.screens

import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import com.atiurin.ultron.allure.step.step
import com.atiurin.ultron.core.compose.list.composeList
import com.atiurin.ultron.page.Screen
import com.example.ultronproject.ui.screens.lazyListTestTag
import com.example.ultronproject.ui.screens.LazyListItemPositionKey

object LazyListScreenPage : Screen<LazyListScreenPage>() {
    private val lazyList = composeList(
        hasTestTag(lazyListTestTag),
        positionPropertyKey = LazyListItemPositionKey
    )

    fun assertScreenDisplayed() = apply {
        step("Assert LazyList is displayed") {
            lazyList.assertExists()
        }
    }

    fun scrollToItem(position: Int) = apply {
        step("Scroll to item at position $position") {
            lazyList.scrollToIndex(position)
        }
    }

    fun assertItemText(position: Int, text: String) = apply {
        step("Assert text of item at position $position") {
            // Находим контейнер по позиции, затем дочерний Text и проверяем его
            lazyList.item(position)
                .getChild(hasText(text))
                .assertTextEquals(text)
        }
    }

    fun clickItem(position: Int) = apply {
        step("Click item at position $position") {
            lazyList.item(position).click()
        }
    }
}