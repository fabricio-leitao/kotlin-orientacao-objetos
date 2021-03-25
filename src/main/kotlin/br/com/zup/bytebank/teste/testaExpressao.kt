package br.com.zup.bytebank.teste

import br.com.zup.bytebank.modelo.Endereco
import java.lang.ArithmeticException
import java.lang.ClassCastException
import java.lang.NumberFormatException

fun testaExpressao() {
    println("início main")

    val entrada: String = "1.0"

    var valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        0.0
    }

    if (valorComTaxa != null) {
        println("Valor recebido: $valorComTaxa")
    } else {
        println("valor inválido")
    }


//    val entrada: String = "1,9"
//
//    try {
//        val valor: Double = entrada.toDouble()
//        println("Valor recebido: $valor")
//    }catch (e: NumberFormatException){
//        println("Problema na conversão")
//        e.printStackTrace()
//    }

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    try {
        funcao2()
    }catch (e: ClassCastException){
        println("ClassCastException foi pego")
    }

    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    try {
        for (i in 1..5) {
            println(i)
            val endereco = Any()
            throw ArithmeticException()
        }
    }catch (e: ClassCastException){
//        println(e.message)
//        println(e.stackTrace)
//        println(e.cause)
//        println(e.printStackTrace())
        println("ClassCastException foi pega")
    }
    println("fim funcao2")
}

