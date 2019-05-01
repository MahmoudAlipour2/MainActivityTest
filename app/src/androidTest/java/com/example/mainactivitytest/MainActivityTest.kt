package com.example.testapplication

import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.filters.LargeTest
import android.support.test.runner.AndroidJUnit4

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import com.example.testapplication.R.id.btn_Zouj
import kotlinx.android.synthetic.main.activity_main.view.*
import org.junit.Assert.*

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @LargeTest
    fun MainActivityTest() {
        @Rule
        val mActivityRule = ActivityTestRule(MainActivity::class.java)
    }

    @Test
    fun viewZoujBtn() {

        val t = MainActivity()
        t.adadd(2)

        onView(withId(R.id.btn_Zouj)).check(R.id.btn_Zouj, isDisplayed())

    }

    @Test
    fun viewFardBtn() {

        val t = MainActivity()
        t.adadd(3)

        onView(withId(R.id.btn_Fard)).check(R.id.btn_Fard, isDisplayed())
    }


}