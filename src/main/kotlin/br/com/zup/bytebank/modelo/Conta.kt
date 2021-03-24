package br.com.zup.bytebank.modelo

var totalContas = 0
    private set

abstract class Conta(
    var titular: Cliente,
    val numeroConta: Int = 0
) {
    var saldo = 0.0
        protected set

    init {
        println("Criando conta")
        totalContas++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {

    init {
        totalContas++
    }
    override fun saca(valor: Double) {
        val valorComtaxa = valor + 0.1
        if(this.saldo >= valorComtaxa){
            this.saldo -= valorComtaxa
        }
    }
}