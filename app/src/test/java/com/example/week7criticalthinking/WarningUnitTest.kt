package com.example.week7criticalthinking

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertNotNull
import junit.framework.TestCase.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.shadows.ShadowAlertDialog
import org.robolectric.shadows.ShadowDialog
import kotlin.use

@RunWith(RobolectricTestRunner::class)
class WarningUnitTest {

    @Test
    fun warningUnitTest() {
        Robolectric.buildActivity(MainActivity::class.java).use { controller ->
            controller.setup()

            val activity = controller.get()

            Warning(activity, "THIS IS A TEST")
            val dialog = ShadowDialog.getLatestDialog()
            assertTrue(dialog.isShowing)
        }
    }
}