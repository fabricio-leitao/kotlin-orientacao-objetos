package br.com.zup.bytebank.exception

class SaldoInsuficienteException(mensagem: String = "O saldo é insuficiente!"): Exception(mensagem)