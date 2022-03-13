package com.example.fragmentpractice.classObject

class Check(var width:Int=10,var length:Int=10,var height:Int=10) {
    var volume: Int
        get() = width * height * length / 1000
         set(value) {
            height = (value * 1000) / (width * length)
        }
    open var water: Double = 0.0
        get() = volume * 0.9
}
class A{
    var x:String?=null
    var y:String?=null

    constructor(x:String){
        this.x=x
    }
    constructor(x:String,y:String){
        this.x=x
        this.y=y
    }
}
interface FishColor{
    val color:String
}
object GoldColor:FishColor{
    override val color: String
        get() = "Gold"
}
class Fish : FishColor by GoldColor{

}
class NewFish(val fishColor: FishColor=GoldColor):fishAction,FishColor by fishColor{
    override fun eat() {
        println("color is ${fishColor.color}")
    }

}
