package com.example.myapplication

fun main() {
    var numero: Int
    println("Deme el numero n: ")
    try{
        numero = readLine()!!.toInt()
        var total1 = 0
        var total2 = 0
       for (i in 1..numero step 1){
           total1 += i
       }
        while(numero > 0){
            total2 += numero
            numero--
        }
        println("La suma es $total1 (bucle for)")
        println("La suma es $total2 (bucle while)")
    }catch (e: NumberFormatException){
        println("El dato introducido debe ser un numero")
    }


}