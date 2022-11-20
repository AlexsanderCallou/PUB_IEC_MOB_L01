package com.example.puc_iec_mob_l01

import com.example.puc_iec_mob_l01.ui.CalcImc
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun testeCalc(){
        val c = CalcImc()
        val b = c.calcImc(112.6,176)

        println(b)


    }

}