package com.example.fragmentpractice.classObject

import com.example.fragmentpractice.classObject.Color.*
import kotlin.math.sin

fun main() {
//    val aquarium=Aquarium(30)
//    println(aquarium.volume)
//    println(aquarium.height)
//    val check=Check()
//    println(check.volume)
//    check.volume=20
//    println(check.volume)
//    println(check.height)
//    print(check.water)
//    var shark=Shark("Blue")
//    shark.eat()
//    shark.makePrint(20)

    var newFish = NewFish()
    newFish.eat()
    values().forEach {
        println(it)
    }
    Color.Red.doColor()
    println(SingleTon()?.shahin)
    println(SingleTon())
    println(SingleTon())
    println(SingleTon())
    println(SingleTon())
}

interface DoColor {
    fun doColor()
}

enum class Color(val colorName: String, val colorCode: String) : DoColor {
    Red(colorName = "Red", colorCode = "1234") {
        override fun doColor() {
            println(colorName + colorCode)
        }
    },
}