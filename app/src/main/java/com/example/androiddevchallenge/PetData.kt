package com.example.androiddevchallenge

import kotlin.random.Random

/**
 * Helper object to provide sample data.
 */
object PetData {

    private val randomAge: Int
        get() = Random.nextInt(0, 10)

    private val randomWeight: Int
        get() = Random.nextInt(10, 40)
    
    /**
     * A list of dogs
     */
    val dogList: List<Dog> = mutableListOf(
        Dog("Zoltan", randomAge, R.raw.dog_001, "M", randomWeight),
        Dog("Cujo", randomAge, R.raw.dog_002, "F", randomWeight),
        Dog("Hellhound", randomAge, R.raw.dog_003, "M", randomWeight),
        Dog("Zowie", randomAge, R.raw.dog_004, "M", randomWeight),
        Dog("Jed", randomAge, R.raw.dog_005, "F", randomWeight),
        Dog("Zuul", randomAge, R.raw.dog_006, "M", randomWeight),
        Dog("Vinz", randomAge, R.raw.dog_007, "F", randomWeight)
    )

}
