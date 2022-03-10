package com.example.fragmentpractice

import java.util.*

fun main() {
    val temperature = 8
    val message = "The water temperature is ${if (temperature > 50) "too warm" else "OK"}."
    val mes = "The water temperature is ${if (temperature < 10) "Cool" else "Hot"}"
    val day = randomDay()
    val foodName = getFoodName(day)
    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    // eager, creates a new list
    val eager = decorations.asSequence().filter { it [0] == 'p' }
//    println("eager: ${eager.toList()[0]}")
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }
    val test={value:Int->value/2}
    println(test(19))
    val sum={a:Int,b:Int,c:Int->a+b+c}
    println(sum(10,3,4))




    var t=Test()



}

fun swim(speed: String = "Fast") {
    println("Swimming $speed")
}

fun getFoodName(day: String): String {
    return when (day) {
        "Saturday" -> "Fish"
        else -> "Vat"
    }
}

fun test(x: Any) {
    print(x)
}

fun randomDay(): String {
    val week = arrayOf(
        "Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday"
    )
    return week[Random().nextInt(week.size)]
}

fun checkCondition(day: String,temperature:Int=20,dirty:Int=20):Boolean{
    return when{
        day=="Sunday"->true
        temperature>20->true
        dirty>20->true
        else-> false
    }
}