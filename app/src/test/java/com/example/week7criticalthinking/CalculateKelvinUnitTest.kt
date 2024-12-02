package com.example.week7criticalthinking

import junit.framework.TestCase.assertEquals
import org.junit.Test


class CalculateKelvinUnitTest {

    @Test
    fun calculateKelvinNormal() {
        val f = 100.0
        val k = CalculateKelvin.calculateKelvin(f)

        val expected = 310.97776
        assertEquals(expected,k, 0.0001)

    }

    @Test
    fun calculateKelvinNegative() {
        val f = -100.0
        val k = CalculateKelvin.calculateKelvin(f)

        val expected = 199.86667
        assertEquals(expected,k, 0.0001)

    }
}
