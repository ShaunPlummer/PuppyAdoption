package com.example.androiddevchallenge

import androidx.annotation.IdRes

/**
 * Information about a Puppy who can be adopted. Including their [name] and [age] in human years.
 */
data class Dog(val name: String, val age: Int, @IdRes val image: Int) {

    /**
     * The age of the dog converted from human years to dog years.
     */
    val dogYears: Int = age * DOG_YEARS_MULTIPLIER

    companion object {
        private const val DOG_YEARS_MULTIPLIER = 7
    }
}

