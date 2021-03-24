package br.com.zup.bytebank.modelo

interface Autenticavel {

    fun autenticar(senha: Int): Boolean
}