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
        Dog("Zoltan", Random.nextInt(), R.raw.dog_001),
        Dog("Cujo", Random.nextInt(), R.raw.dog_002),
        Dog("Hellhound", Random.nextInt(), R.raw.dog_003),
        Dog("Zowie", Random.nextInt(), R.raw.dog_004),
        Dog("Jed", Random.nextInt(), R.raw.dog_005),
        Dog("Zuul", Random.nextInt(), R.raw.dog_006),
        Dog("Vinz", Random.nextInt(), R.raw.dog_007)
    )

}
