package com.example.fragmentpractice.classObject

sealed class SealedClass {
    data class Success(val result: String): SealedClass()
    data class Error(val error: String): SealedClass()
    object Loading:SealedClass()
}
fun getData():SealedClass{
    return SealedClass.Success((100..1000).random().toString())
}
fun main(){
    val data= getData()
    when(data){
        is SealedClass.Success->{
            println(data)
        }
    }
}