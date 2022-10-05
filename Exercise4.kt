package com.example.kotlinbasics

fun main() {

    val list1 = arrayListOf<Double>(1.0, 2.0, 3.0, 2.0, 4.0)
    var counter = 0.0
    for (i in 0 until list1.size) {
        counter+= list1[i]
    }
    var average =counter/list1.size
    println(average)

}