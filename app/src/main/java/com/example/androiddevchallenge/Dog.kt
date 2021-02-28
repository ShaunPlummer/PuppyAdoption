package com.example.androiddevchallenge

import androidx.annotation.IdRes

/**
 * Information about a Puppy who can be adopted. Including their [name] and [age] in human years.
 */
data class Dog(
    val name: String,
    val age: Int,
    @IdRes val image: Int,
    val gender: String = "",
    val weight: Int = 0

)

