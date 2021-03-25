import br.com.zup.bytebank.modelo.Cliente
import br.com.zup.bytebank.modelo.ContaCorrente
import br.com.zup.bytebank.modelo.ContaPoupanca
import br.com.zup.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    var minato = Cliente(nome = "Minato", cpf = "", senha = 2)

    val contaCorrente = ContaCorrente(
        titular =  Cliente(
            nome = "Gokudera",
            cpf = "111.222.333-44",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua dos Cravos"
            )
            ),
        numeroConta = 1000
    )
    val contaPoupanca = ContaPoupanca(minato, 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após o saque corrente: ${contaCorrente.saldo}")
    println("saldo após o saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca, 1)

    println("saldo corrente após transferir para a poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência da corrente: ${contaPoupanca.saldo}")

    println("--------------------------------------------")
    println("titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereço titular ${contaCorrente.titular.endereco.logradouro}")
}
