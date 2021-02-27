package com.example.androiddevchallenge

import kotlin.random.Random

/**
 * Helper object to provide sample data.
 */
object PetData {

    /**
     * A list of dogs
     */
    val dogList: List<Dog> = mutableListOf(
        Dog("Zoltan", Random.nextInt()),
        Dog("Cujo", Random.nextInt()),
        Dog("Hellhound", Random.nextInt()),
        Dog("Zowie", Random.nextInt()),
        Dog("Jed", Random.nextInt()),
        Dog("Zuul", Random.nextInt()),
        Dog("Vinz", Random.nextInt())
    )

}
