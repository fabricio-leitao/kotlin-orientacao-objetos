package br.com.zup.bytebank.modelo

data class Livro (
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
    )