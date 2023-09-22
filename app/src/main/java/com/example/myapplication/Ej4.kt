package com.example.myapplication

fun main(){
    println("¿Como es le clima de hoy?")
    when(readln().toInt()) {
        1 -> {println("Soleado")}
        2 -> {println("Nublado")}
        3 -> {println("Lluvioso")}
        4 -> {println("Tormentoso")}
        5 -> {println("Nevado")}
        else -> {println("Preguntale a Google")}

    }
}