package br.com.zup.bytebank.paradigmafuncional

import br.com.zup.bytebank.modelo.Cliente
import br.com.zup.bytebank.modelo.ContaPoupanca
import br.com.zup.bytebank.modelo.Endereco

fun main() {


}

public fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal: Double = taxaAnual / 12
    println("taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.11-11", senha = 1234), numeroConta = 1000)
    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("rendimento mensal $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulação rendimento anual: $rendimentoAnual")
}

public fun testaWith() {
    with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "Apartamento"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}

