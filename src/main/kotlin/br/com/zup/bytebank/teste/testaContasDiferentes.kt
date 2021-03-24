import br.com.zup.bytebank.modelo.Cliente
import br.com.zup.bytebank.modelo.ContaCorrente
import br.com.zup.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {

    var gokudera = Cliente(nome = "Gokudera", cpf = "", senha = 1)
    var minato = Cliente(nome = "Minato", cpf = "", senha = 2)

    val contaCorrente = ContaCorrente(gokudera, 1000)
    val contaPoupanca = ContaPoupanca(minato, 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após o saque corrente: ${contaCorrente.saldo}")
    println("saldo após o saque poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para a poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência da corrente: ${contaPoupanca.saldo}")
}
