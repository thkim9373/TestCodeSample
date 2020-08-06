package com.hoony.testcodesample.example1

data class Animal(
    val name: String = "",
    val age: Int = 0,
    val isFly: Boolean = false
) {
    fun canFly(species: Species): Boolean =
        when (species) {
            Species.BIRD -> true
            else -> false
        }
}

enum class Species {
    DOG, CAT, BIRD
}