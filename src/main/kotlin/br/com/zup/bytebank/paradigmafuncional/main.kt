package br.com.zup.bytebank.paradigmafuncional

import br.com.zup.bytebank.modelo.Endereco


fun main() {
    val testeFuncao: () -> Unit
    Endereco().let { it }
    //higher order function
    "".let(::testeRecebeString)
    1.let { it }
}

fun testeRecebeString(valor: String){

}