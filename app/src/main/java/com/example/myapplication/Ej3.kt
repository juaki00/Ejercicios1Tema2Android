package com.example.myapplication

fun main() {
    var distancia = 10.0
    var disponible = false
    while (distancia > 0.5 || !disponible) {
        println("Introduce la distancia en kilometros")
        distancia = readLine()!!.toDouble()
        println("Introduce la disponibilidad (true = disponible , false = no disponible)")
        disponible = readLine()!!.toBoolean()
        println("La distacia es $distancia y la disponibilidad es $disponible")

        if (distancia <= 0.5) {
            if (disponible)
                println("Listo para iniciar recorrido!")
            else
                println("Conductor cercano pero no disponible!")
        } else {
            if (disponible)
                println("Conductor disponible pero muy lejos,aplicarán tarifas más altas!")
            else
                println("No hay conductores disponibles!")
        }
    }
}
