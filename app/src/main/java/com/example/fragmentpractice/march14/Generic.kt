package com.example.fragmentpractice.march14

class Generic<T> (private val array: Array<T>){
    fun findElement(element:T,foundElement:(index:Int,element: T?)->Unit){
        for (i in array.indices){
            if(array[i]==element){
                foundElement(i,array[i])
                return
            }
        }
        foundElement(-1,null)
        return
    }
}
fun main(){
    val generic=Generic<Int>(arrayOf(1,2,3,4,5,6,7))
    val generic1=Generic<String>(arrayOf("A","B","C","D","E"))
    generic.findElement(3){
        index, element ->
        println("Index: $index")
        println("Element: $element")
    }
    generic1.findElement("C"){
        index, element ->
        println("Index: $index")
        println("Element: $element")
    }
}