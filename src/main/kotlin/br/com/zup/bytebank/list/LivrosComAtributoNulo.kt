package br.com.zup.bytebank.list

import br.com.zup.bytebank.modelo.Livro

fun main() {
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida"}
        .forEach{ (editora: String?, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}