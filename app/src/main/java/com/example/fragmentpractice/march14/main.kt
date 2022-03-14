package com.example.fragmentpractice.march14

class ArrayUtil(private val array: Array<Int>) {
    fun findElement(element: Int, findFun: (index: Int, element: Int?) -> Unit) {
        for (i in array.indices) {
            if (array[i] == element) {
                findFun(i, array[i])
                return
            }
        }
        findFun(-1, null)
        return
    }
}

fun main() {
    val arrayUtil = ArrayUtil(arrayOf(1, 2, 3, 4, 5))
    arrayUtil.findElement(3) { index, element ->
        println("Index: $index")
        println("Element: $element")
    }

}
