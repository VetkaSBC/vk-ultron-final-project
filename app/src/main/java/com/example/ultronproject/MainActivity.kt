package com.example.ultronproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import com.example.ultronproject.ui.screens.ListScreen
import com.example.ultronproject.ui.screens.GreetingScreen
import com.example.ultronproject.ui.screens.ClickerScreen
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.*
import com.example.ultronproject.ui.screens.PersonalScreen
import com.example.ultronproject.ui.theme.UltronProjectTheme
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UltronProjectTheme {
                AppWithDrawer()
            }
        }
    }
}

@Composable
fun AppWithDrawer() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text(
                    text = "Меню",
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.padding(16.dp)
                )

                DrawerItem("Главная") {
                    scope.launch { drawerState.close() }
                    navController.navigate("home")
                }

                DrawerItem("Персональная информация") {
                    scope.launch { drawerState.close() }
                    navController.navigate("personal")
                }

                DrawerItem("Список") {
                    scope.launch { drawerState.close() }
                    navController.navigate("list")
                }

                DrawerItem("Кликер") {
                    scope.launch { drawerState.close() }
                    navController.navigate("clicker")
                }
            }
        }
    ) {
        Scaffold(
            topBar = {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = {
                        scope.launch { drawerState.open() }
                    }) {
                        Icon(Icons.Filled.Menu, contentDescription = "меню")
                    }
                    Text(text = "Ultron App", style = MaterialTheme.typography.titleMedium)
                }
            }
        ) { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = "home",
                modifier = Modifier.padding(innerPadding)
            ) {
                composable("home") {
                    GreetingScreen()
                }
                composable("clicker") {
                    ClickerScreen()
                }
                composable("list") {
                    ListScreen()
                }
                composable("personal") {
                    PersonalScreen()
                }
            }
        }
    }
}

@Composable
fun DrawerItem(text: String, onClick: () -> Unit) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(16.dp)
    )
}



