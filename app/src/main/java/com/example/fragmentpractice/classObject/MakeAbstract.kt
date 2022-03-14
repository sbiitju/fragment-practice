package com.example.fragmentpractice.classObject

abstract class MakeAbstract {
    abstract fun makeSomethingNew()
    abstract val name:String
    abstract fun shahin()
}
abstract class Test() : MakeAbstract() {
    abstract var shahin:String
    override fun makeSomethingNew() {

    }

    abstract fun fromTest()
}
class AnotherTest(override val name: String, override var shahin: String) : Test() {
    override fun fromTest() {
        TODO("Not yet implemented")
    }

    override fun shahin() {
        TODO("Not yet implemented")
    }

}