package com.example.myapplication

fun main() {
    println("Deme el numero n: ")
    var numero: Int = readLine()!!.toInt()
    for(i in 2..numero step 2){
        println(i)
    }
    if(numero<=0){
        println("Inserta un numero positivo")
    }
}