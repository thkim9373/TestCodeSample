package com.hoony.testcodesample.example1

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class Example1UnitTest {

    @Test
    fun mockTest() {
        val animal: Animal = Mockito.mock(Animal::class.java)

        Mockito.`when`(animal.name).thenReturn("Puppy")
        Mockito.`when`(animal.age).thenReturn(15)
        Mockito.`when`(animal.isFly).thenReturn(false)

        assertEquals("Puppy", animal.name)
        assertEquals(15, animal.age)
        assertEquals(false, animal.isFly)
    }
}