package com.example.fragmentpractice

fun main() {
    println("Shahin Bashar")
    val typeOfArry= arrayOf("Shahin","Bashar")
    typeOfArry[1]="Mousuma Ahmed"
    val listOfItem= mutableListOf("A","N","C")
    println(listOfItem[0])
    listOfItem.add("")
    val mutableMap= mutableMapOf("Shahin" to 1,"Sithi" to 1,1 to "Shahin")
    println(mutableMap[1])
}
