import br.com.zup.bytebank.modelo.Cliente
import br.com.zup.bytebank.modelo.ContaPoupanca
import br.com.zup.bytebank.modelo.totalContas

fun main() {

    val deku = Cliente(nome = "Deku", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(titular = deku, numeroConta = 1000)

    testaContasDiferentes()

    println("Total de contas: $totalContas")
}






