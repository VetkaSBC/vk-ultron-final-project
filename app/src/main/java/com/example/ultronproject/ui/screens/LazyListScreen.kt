package com.example.ultronproject.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.testTag
import androidx.compose.ui.unit.dp

// Ключ позиции для Ultron
val LazyListItemPositionKey = SemanticsPropertyKey<Int>("LazyListItemPosition")

const val lazyListTestTag = "lazyListTestTag"
const val lazyListItemTestTag = "lazyListItem_"

@Composable
fun LazyListScreen() {
    val items = List(100) { "Item $it" }

    LazyColumn(
        modifier = Modifier
            .semantics { testTag = lazyListTestTag },
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        itemsIndexed(items) { index, item ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .semantics {
                        testTag = "$lazyListItemTestTag$index"
                        this[LazyListItemPositionKey] = index
                    }
            ) {
                Text(
                    text = item,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}