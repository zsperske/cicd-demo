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
        // To make sure Firebase captures a video...
        Thread.sleep(3000L)

        composeTestRule.onNodeWithText("Hello CSE 403!").assertIsDisplayed()
    }
} 