package com.example.myapplication

fun main() {
    val lista = arrayOf("Jumanji","ToyStory","PulpFiction","Batman:Elcaballerodelanoche","KillBill")
    var max = 0
    var indice = 0
    var tituloMax = ""
    var indiceMax = 0
    for (titulo in lista){
        if(max<titulo.length){
            max=titulo.length
            tituloMax= titulo
            indiceMax = indice
        }
        indice++
    }
    println(tituloMax)
    println(indiceMax)
}