package com.example.myapplication

fun main() {
    var numero: Int
    println("Deme la cantidad de miligramos: ")
    try{
        numero = readLine()!!.toInt()
        if (numero > 100) {
            println("¡Felicidades,es una buena poción!")
        }
        else{
            println("La poción es mediocre,sangre sucia inmunda")
        }
    }catch (e: NumberFormatException){
        println("El dato introducido debe ser un numero")
    }


}