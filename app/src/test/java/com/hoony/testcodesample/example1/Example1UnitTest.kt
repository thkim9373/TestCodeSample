package com.hoony.testcodesample.example1

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

// Mockito 를 사용하려면 요렇게 추가함
// @RunWith(AndroidJUnit4::class) 를 붙여도 동작하긴 한다고 함.
@RunWith(MockitoJUnitRunner::class)
class Example1UnitTest {

    @Test   // 요게 있으면 테스트 메소드라고 인식
    fun mockTest() {
        // animal 클래스를 mocking 하여 객체로 만듦
        val animal: Animal = mock(Animal::class.java)

        // 이 객체의 getName() 이 호출되면 "Puppy"라는 값을 리턴하도록 함
        `when`(animal.name).thenReturn("Puppy")
        `when`(animal.age).thenReturn(15)
        `when`(animal.isFly).thenReturn(false)

        // animal.name 이 호출되었을 때, 값이 "Puppy" 임을 검사
        assertEquals("Puppy", animal.name)
        assertEquals(15, animal.age)
        assertEquals(false, animal.isFly)
    }

    @Test
    fun test2() {
        val animal: Animal = mock(Animal::class.java)

        `when`(animal.canFly(ArgumentMatchers.any())).thenReturn(true)

        assertEquals(true, animal.canFly(Species.BIRD))
    }
}