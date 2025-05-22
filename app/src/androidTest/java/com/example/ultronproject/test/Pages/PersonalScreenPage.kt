package com.example.ultronproject.test.Pages

import androidx.compose.ui.test.hasText
import com.atiurin.ultron.extensions.inputText

class PersonalScreenPage {


    fun enterInputFields(name: String, lastName: String, fatherName: String) {
        hasText("Имя").inputText(name)
        hasText("Фамилия").inputText(lastName)
        hasText("Отчество").inputText(fatherName)
    }

    fun checkData(text: String) {
        hasText(text)
    }
}