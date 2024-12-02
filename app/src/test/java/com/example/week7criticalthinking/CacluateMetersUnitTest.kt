package com.example.week7criticalthinking

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CalculateMetersUnitTest {

    @Test
    fun calculateMetersNormal() {
        val f = 100.0
        val m = CalculateMeters.calculateMeters(f)

        val expected = 30.48
        assertEquals(expected,m, 0.0001)

    }

    @Test
    fun calculateMetersNegative() {
        val f = -100.0
        val m = CalculateMeters.calculateMeters(f)

        val expected = -30.48
        assertEquals(expected,m, 0.0001)

    }
}