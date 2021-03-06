package br.com.zup.bytebank.teste

import br.com.zup.bytebank.modelo.*

fun testaObjects() {
    val tai = object : Autenticavel {
        val nome: String = "Tai"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autenticar(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(tai, 1000)

    println("Nome do cliente ${tai.nome}")

    val deku = Cliente(nome = "Deku", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = deku, numeroConta = 1000)

    println("Total de contas: ${Conta.total}")
}
