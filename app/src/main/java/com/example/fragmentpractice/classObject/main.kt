package com.example.fragmentpractice.classObject

import android.os.Build
import androidx.annotation.RequiresApi


@RequiresApi(Build.VERSION_CODES.N)
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

//    var newFish = NewFish()
//    newFish.eat()
//    values().forEach {
//        println(it)
//    }
//    Color.Red.doColor()
//    println(SingleTon()?.shahin)
//    println(SingleTon())
//    println(SingleTon())
//    println(SingleTon())
//    println(SingleTon())
    fun String.hasSpace():Boolean{
    val found = this.find { it == ' ' }
    return found != null
    }
    println("ShahinBashar".hasSpace())
    val element="Shahin" to "Sithi"
    print(element.toList()[1])
    val student=Student("Shahin Bashar","01613162522","shahin@kambaii.com")
    val (name,_,email)=student
    println(name+email)
    val list= mutableListOf<String>()
    list.add("Shahin")
    list.add("Saheb Ali")
    list.add("sithi")
    list.add("Afsana")
    println(list.subList(1,3))
    println(list.sumBy {
        it.length
    })
    for (i in list.iterator()){
        println("$i ")
    }
    val exampleOfHashMap= hashMapOf("Shahin" to "Sithi","Sajib" to "Sithi","Habib" to "Tish","Salman" to "Luna")
    println(exampleOfHashMap.getOrDefault("Bashar","I didn't know"))
    println(exampleOfHashMap.getOrElse("Bashar"){
        println("no data found")
        "Shahin Bashar"
    })



}
data class Student(var name: String,var number:String,var email:String)

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