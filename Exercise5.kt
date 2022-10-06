package com.example.kotlinbasics

fun main(){
math(4.0,4.0)

}

fun math (number1:Double,number2:Double,string:String="+"){
    when(string){
        "+"-> println(number1+number2)
        "-"-> println(number1-number2)
        "*"->println(number1*number2)
        "/"->println(number1/number2)
        else -> println("Unknown string!")
    }
}