package com.example.ultronproject.test

import com.atiurin.ultron.core.compose.createDefaultUltronComposeRule
import com.example.ultronproject.test.Pages.PersonalScreenPage
import com.example.ultronproject.ui.screens.PersonalScreen
import org.junit.Rule
import org.junit.Test

class PersonalTest {
    @get:Rule
    val composeRule = createDefaultUltronComposeRule()
    val textName = "Ваше имя: "
    val textLastName = "Ваша фамилия: "
    val textFatherName = "Ваше отчество: "

    @Test
    fun enterPersonalInformationTest() {
        val personalScreen = PersonalScreenPage()

        composeRule.setContent {
            PersonalScreen()
        }

        personalScreen.enterInputFields("Данила", "Ветошев", "Владимирович")
        personalScreen.checkData(textName + "Данила")
        personalScreen.checkData(textLastName + "Ветошев")
        personalScreen.checkData(textFatherName + "Владимироич")
    }
}