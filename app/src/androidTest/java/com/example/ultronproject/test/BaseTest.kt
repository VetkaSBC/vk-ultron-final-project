package com.example.ultronproject.test;

import com.atiurin.ultron.allure.config.UltronAllureConfig
import com.atiurin.ultron.allure.listeners.DetailedOperationAllureListener
import com.atiurin.ultron.allure.listeners.ScreenshotAttachListener
import com.atiurin.ultron.allure.listeners.WindowHierarchyAttachListener
import com.atiurin.ultron.core.compose.config.UltronComposeConfig
import com.atiurin.ultron.core.config.UltronCommonConfig
import com.atiurin.ultron.core.config.UltronConfig
import org.junit.BeforeClass

open class BaseTest {
    companion object {
        @BeforeClass
        @JvmStatic
        fun config() {
            UltronConfig.applyRecommended()
            UltronAllureConfig.applyRecommended()
            UltronComposeConfig.applyRecommended()
            UltronCommonConfig.addListener(ScreenshotAttachListener())
            UltronCommonConfig.addListener(WindowHierarchyAttachListener())
            UltronCommonConfig.addListener(DetailedOperationAllureListener())
            //UltronAllureConfig.setAllureResultsDirectory("build/allure-results")
        }
    }
}
