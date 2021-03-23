fun testaComportamentosConta() {
    val contaTodoroki = ContaCorrente(titular = "Todoroki", numeroConta = 123)
    contaTodoroki.deposita(200.0)

    val contaDeku = ContaPoupanca(titular = "Deku", numeroConta = 134)
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

    if (contaDeku.transfere(100.0, contaTodoroki)) {
        println("Transferência efetuada com sucesso!")
    } else {
        println("Falha na Transferência!")
    }

    println("Saldo Todoroki: ${contaTodoroki.saldo}")
    println("Saldo Deku: ${contaDeku.saldo}")
}
