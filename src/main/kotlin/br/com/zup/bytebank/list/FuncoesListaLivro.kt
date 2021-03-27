package br.com.zup.bytebank.list

import br.com.zup.bytebank.modelo.Livro

fun List<Livro?>.imprimeComMarcadores(){
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" #### Lista de Livros #### \n$textoFormatado")
}