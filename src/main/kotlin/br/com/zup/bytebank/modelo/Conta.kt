package br.com.zup.bytebank.modelo

import br.com.zup.bytebank.exception.FalhaAutenticacaoException
import br.com.zup.bytebank.exception.SaldoInsuficienteException


abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int = 0
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    override fun autenticar(senha: Int): Boolean {
        //delegação
        return titular.autenticar(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraído: $valor"
            )
        }

        if(!autenticar(senha)){
            throw FalhaAutenticacaoException()
        }
        saldo -= valor
        destino.saldo += valor

    }
}

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {

    override fun saca(valor: Double) {
        val valorComtaxa = valor + 0.1
        if (this.saldo >= valorComtaxa) {
            this.saldo -= valorComtaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}