package com.example.fragmentpractice.classObject

import kotlin.math.PI

open class Aquarium(open var height:Int=10, val width:Int=20, val length:Int=30) {
    init {
        println("Length: $length, Widht:$width and Height:$height")
    }
    open var volume:Int get() = width*height*length
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
class TowerTank(override var height: Int,var diamiter:Int):Aquarium(height=height, width = diamiter, length = diamiter){
    override var volume:Int get() = (width/2 * length/2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width/2 * length/2)).toInt()
        }

}