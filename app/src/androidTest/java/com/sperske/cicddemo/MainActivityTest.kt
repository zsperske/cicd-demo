package com.sperske.cicddemo

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testGreetingIsDisplayed() {
        // To make sure Firebase captures a video...
        Thread.sleep(3000L)

        composeTestRule.onNodeWithText("Hello CSE 403!").assertIsDisplayed()
    }

    @Test
    fun testLogoToggleButton() {
        // To make sure Firebase captures a video...
        Thread.sleep(3000L)
        
        // Initially, logo should not be visible
        composeTestRule.onNodeWithContentDescription("UW Logo").assertDoesNotExist()
        
        // Click the show logo button
        composeTestRule.onNodeWithText("Show Logo").performClick()
        
        // Logo should now be visible
        composeTestRule.onNodeWithContentDescription("UW Logo").assertIsDisplayed()
        
        // Button text should have changed
        composeTestRule.onNodeWithText("Hide Logo").assertIsDisplayed()
        
        // Click the hide logo button
        composeTestRule.onNodeWithText("Hide Logo").performClick()
        
        // Logo should be hidden again
        composeTestRule.onNodeWithContentDescription("UW Logo").assertDoesNotExist()
        
        // Button text should have changed back
        composeTestRule.onNodeWithText("Show Logo").assertIsDisplayed()
    }
} 