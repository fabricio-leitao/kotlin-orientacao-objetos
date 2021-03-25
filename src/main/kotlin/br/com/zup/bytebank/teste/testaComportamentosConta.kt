import br.com.zup.bytebank.exception.SaldoInsuficienteException
import br.com.zup.bytebank.modelo.Cliente
import br.com.zup.bytebank.modelo.ContaCorrente
import br.com.zup.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val todoroki = Cliente(nome = "Todoroki", cpf = "123.123.123-34", senha = 1234)

    val contaTodoroki = ContaCorrente(titular = todoroki, numeroConta = 123)
    contaTodoroki.deposita(200.0)

    val deku = Cliente(nome = "Deku", cpf = "234.567.890-34", senha = 123)

    val contaDeku = ContaPoupanca(titular = deku, numeroConta = 134)
    contaDeku.deposita(300.0)

    println(contaTodoroki.titular)
    println(contaTodoroki.numeroConta)
    println(contaTodoroki.saldo)
    println("--------------------")
    println(contaDeku.titular)
    println(contaDeku.numeroConta)
    println(contaDeku.saldo)

    println("---------------------------------")
    println("Depositando na conta do Todoroki:")
    contaTodoroki.deposita(50.0)
    println(contaTodoroki.saldo)
    println("Depositando na conta do Deku:")
    contaDeku.deposita(70.0)
    println(contaDeku.saldo)

    println("---------------------------------")
    println("Sacando da conta do Todoroki:")
    contaTodoroki.saca(250.0)
    println(contaTodoroki.saldo)
    println("Sacando da conta do Deku:")
    contaDeku.saca(200.0)
    println(contaDeku.saldo)


    println("----------------------------------")
    println("Transferencia da conta do Deku para o Todoroki")

    try {
        contaDeku.transfere(100.0, contaTodoroki)
        println("Transferência efetuada com sucesso!")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na Transferência!")
        println("Saldo insuficiente")
        e.printStackTrace()
    }


    println("Saldo Todoroki: ${contaTodoroki.saldo}")
    println("Saldo Deku: ${contaDeku.saldo}")
}
