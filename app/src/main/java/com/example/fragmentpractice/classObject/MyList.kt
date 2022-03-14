package com.example.fragmentpractice.classObject

class MyList<T> {
    fun get(pos: Int): T {
        TODO("implement")
    }
    fun addItem(item: T) {}
}
open class WaterSupply(var needsProcessing: Boolean)
class TapWater :WaterSupply(false){
    fun addChemicalClener(test:Boolean){
        needsProcessing=test
    }
}
class Other<T>(val waterSupply: T)
fun genereicExample(){
    val other=Other(TapWater())
    other.waterSupply.addChemicalClener(true)
}