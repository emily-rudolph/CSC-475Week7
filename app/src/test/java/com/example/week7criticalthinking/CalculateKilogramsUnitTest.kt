package com.example.week7criticalthinking

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CalculateKilogramsUnitTest {

    @Test
    fun calculateKilogramsNormal() {
        val p = 100.0
        val k = CalculateKilograms.calculateKilograms(p)

        val expected = 45.3514
        assertEquals(expected,k, 0.0001)

    }

    @Test
    fun calculateKilogramsNegative() {
        val p = -100.0
        val k = CalculateKilograms.calculateKilograms(p)

        val expected = -45.3514
        assertEquals(expected,k, 0.0001)

    }
}