package com.example.week7criticalthinking

import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.junit.Test
import org.junit.Assert.assertEquals
import org.robolectric.RobolectricTestRunner
import org.robolectric.Robolectric
import org.junit.runner.RunWith

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
class MainActivityUnitTest {

    @Test
    fun clickMetersButtonTest() {
        Robolectric.buildActivity(MainActivity::class.java).use { controller ->
            controller.setup()

            val activity = controller.get()

            val inputFeet = activity.findViewById<EditText>(R.id.getFeet)
            val textAnswer = activity.findViewById<TextView>(R.id.textMetersAnswer)
            inputFeet.setText("50")

            activity.findViewById<Button>(R.id.buttonCalculateMeters).performClick()

            assertEquals("15.240", textAnswer.text.toString())
        }
    }

    @Test
    fun clickKilogramsButtonTest() {
        Robolectric.buildActivity(MainActivity::class.java).use { controller ->
            controller.setup()

            val activity = controller.get()

            val inputPounds = activity.findViewById<EditText>(R.id.getPounds)
            val textAnswer = activity.findViewById<TextView>(R.id.textKilogramsAnswer)
            inputPounds.setText("50")

            activity.findViewById<Button>(R.id.buttonCalculateKilograms).performClick()

            assertEquals("22.676", textAnswer.text.toString())
        }
    }

    @Test
    fun clickKelvinButtonTest() {
        Robolectric.buildActivity(MainActivity::class.java).use { controller ->
            controller.setup()

            val activity = controller.get()

            val inputPounds = activity.findViewById<EditText>(R.id.getFahrenheit)
            val textAnswer = activity.findViewById<TextView>(R.id.textKelvinAnswer)
            inputPounds.setText("50")

            activity.findViewById<Button>(R.id.buttonCalculateKelvin).performClick()

            assertEquals("283.200", textAnswer.text.toString())
        }
    }
}



