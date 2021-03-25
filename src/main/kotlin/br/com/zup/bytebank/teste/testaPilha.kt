package br.com.zup.bytebank.teste

import br.com.zup.bytebank.exception.SaldoInsuficienteException
import testaComportamentosConta

fun testaPilha() {
    println("início main")
    println("fim main")
}

//recursão que causará um stackoverflow
fun teste(){
    return teste()
}

//fun funcao1() {
//    println("início funcao1")
//    try {
//        funcao2()
//    }catch (e: ClassCastException){
//        println("ClassCastException foi pego")
//    }
//
//    println("fim funcao1")
//}
//
//fun funcao2() {
//    println("início funcao2")
//    for (i in 1..5) {
//        println(i)
//        val endereco = Any()
//        throw SaldoInsuficienteException()
//    }
//    println("fim funcao2")
//}

