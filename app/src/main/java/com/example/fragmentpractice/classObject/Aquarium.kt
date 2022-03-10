package com.example.fragmentpractice.classObject

class Aquarium(var height:Int=10, val width:Int=20, val length:Int=30) {
    init {
        println("Length: $length, Widht:$width and Height:$height")
    }
    var volume:Int get() = width*height*length
    set(value) {
        height= (value * 1000) / (width * length)
    }
    init {
        println(volume)
        println("check")
        println(height)
    }
    constructor(numberOfFish:Int):this(){
        println(volume)
        println(numberOfFish)
    }

}