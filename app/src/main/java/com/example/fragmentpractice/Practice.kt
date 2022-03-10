package com.example.fragmentpractice

fun main() {
    fun getCardString(cardName: String, cardValue: Int) = "$cardName = $cardValue"
    var cardString = getCardString("This is a card 1", 10)
    println(3.5.times(19))
    val check = 101
    if (check in 1..100) println("Got It")
    else println("Didn't find")
    when (check) {
        in 1..10 -> print("1 to 10")
        in 11..20 -> print("11 to 20")
        else -> println("Out of 20")
    }
    val list = mutableListOf("SHahin", "Bashar")
    list.add("test")
    println(list)
    val array = arrayOf("Shahin", "Bashar", "Other")
    println(java.util.Arrays.toString(array))
    val numbers = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    for ((i, j) in numbers.withIndex()) {
        println("Index $i is $j")
    }
    val foo2 = numbers + numbers3
    println(java.util.Arrays.toString(foo2))
    println("Shahin Bashar")
    val typeOfArry = arrayOf("Shahin", "Bashar")
    typeOfArry[1] = "Mousuma Ahmed"
    val listOfItem = mutableListOf("A", "N", "C")

    //Heap a joma hoy
    //Stack Function

    //Heap --- object
    //Stack--- function

    //Gear Base collection --->


    println(listOfItem[0])
    listOfItem.add("")
    val mutableMap = mutableMapOf("Shahin" to 1, "Sithi" to 1, 1 to "Shahin")
    repeat(10) {
        println(it)
    }
    println(mutableMap[1])
}
