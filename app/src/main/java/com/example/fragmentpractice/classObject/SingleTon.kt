package com.example.fragmentpractice.classObject

class SingleTon private constructor(){
    var shahin:String="Shahin Bashar"
    companion object{
        private var instance:SingleTon?=null
        operator fun invoke()= synchronized(this) {
            if(instance==null)
                instance=SingleTon()
                instance
        }
    }
}