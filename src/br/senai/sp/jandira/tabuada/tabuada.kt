package br.senai.sp.jandira.tabuada

fun main() {

    println("----------TABUADA----------")

    println("Qual é o multiplicador? ")
    var multiplicador = readln().toInt()

    println("Qual é o mínimo multiplicador? ")
    var minimo = readln().toInt()

    println("Qual o máximo multiplicador?")
    var maximo = readln().toInt()

    println("A tabuada do $multiplicador é: ")

    for (produto in minimo..maximo) {
        println("$multiplicador X $produto = ${multiplicador * produto}")
    }
}