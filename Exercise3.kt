package com.example.kotlinbasics


fun main() {
    //Exercise 1
    for (x in 1..100) {
        if(x==71)
            println("IT'S OVER 70!!!")
    }

    //Exercise 2
    var temperature = 35
    while(temperature>10){

        when (temperature) {
            30 -> println("It's Hot")
            20-> println("It's Comfy")
            15 -> println("IT'S COLD!!!")
            else -> println("$temperature")

        }
        temperature--
    }
}