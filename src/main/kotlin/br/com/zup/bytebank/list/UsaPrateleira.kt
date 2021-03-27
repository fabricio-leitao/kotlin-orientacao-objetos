package br.com.zup.bytebank.list

import br.com.zup.bytebank.modelo.Prateleira

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()
}