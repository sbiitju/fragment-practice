package com.example.fragmentpractice.classObject

abstract class AquariumFish{
    abstract val color: String
}
class Shark(override val color: String) : AquariumFish(),fishAction {
    init {
        println("Color of Shark: $color")
    }

    override fun eat() {
        println("Shark is eating")
    }

    override fun makePrint(n: Int) {
        super.makePrint(n)
    }
}
class Plecostomus: AquariumFish() {
    override val color=""

}