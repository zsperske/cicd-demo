package com.sperske.cicddemo

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun greetingIsDisplayed() {
        // Given the app is launched

        // When nothing is done (initial state)

        // Then "Hello Android!" should be displayed
        composeTestRule.onNodeWithText("Hello Android!").assertIsDisplayed()
    }
} 