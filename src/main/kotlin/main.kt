fun main() {
    println("Bem vindo ao Bytebank!")

    val contaTodoroki = Conta(titular = "Todoroki", numeroConta = 123)
    contaTodoroki.deposita(200.0)

    val contaDeku = Conta(titular = "Deku", numeroConta = 134)
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

class Conta(
    var titular: String,
    val numeroConta: Int = 0
) {
    var saldo = 0.0
        private set

//    constructor(titular: String, numeroConta: Int){
//        this.titular = titular
//        this.numeroConta = numeroConta
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("Joao")
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular da conta ${contaJoao.titular}")
    println("titular da conta ${contaMaria.titular}")
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo positivo!")
        saldo == 0.0 -> println("Saldo neutro!")
        else -> println("Saldo negativo!")
    }
}

fun testaLacos() {
//        Ordem crescente
    for (i in 1..5) {
        val titular: String = "Todoroki"
        val numeroConta: Int = i + 1000
        var saldo: Double = i + 10.0

        println("titular: $titular")
        println("número da conta: $numeroConta")
        println("Saldo da conta: $saldo")
    }
//      Ordem Decrescente
//    for (i in 5 downTo 1){
//        val titular: String = "Todoroki"
//        val numeroConta: Int = i + 1000
//        var saldo: Double = i + 10.0
//
//        println("titular: $titular")
//        println("número da conta: $numeroConta")
//        println("Saldo da conta: $saldo")
//    }
//      Pulando de 2 em dois
//    for (i in 1..5 step 2){
//        val titular: String = "Todoroki"
//        val numeroConta: Int = i + 1000
//        var saldo: Double = i + 10.0
//
//        println("titular: $titular")
//        println("número da conta: $numeroConta")
//        println("Saldo da conta: $saldo")
//    }
//      Until excluindo o valor final
//    for (i in 1 until 5){
//        val titular: String = "Todoroki"
//        val numeroConta: Int = i + 1000
//        var saldo: Double = i + 10.0
//
//        println("titular: $titular")
//        println("número da conta: $numeroConta")
//        println("Saldo da conta: $saldo")
//    }

//    var i = 0
//    while(i < 5){
//                val titular: String = "Todoroki"
//        val numeroConta: Int = i + 1000
//        var saldo: Double = i + 10.0
//
//        println("titular: $titular")
//        println("número da conta: $numeroConta")
//        println("Saldo da conta: $saldo")
//        i++
//    }
//    do{
//        val titular: String = "Todoroki"
//        val numeroConta: Int = i + 1000
//        var saldo: Double = i + 10.0
//
//        println("titular: $titular")
//        println("número da conta: $numeroConta")
//        println("Saldo da conta: $saldo")
//        i++
//    } while (i < 5)


//      Utilizando Break;
//    loop@ for (i in 1..100) {
//        println("i $i")
//        for (j in 1..100) {
//            println("j $j")
//            if (j == 5) break@loop
//        }
//    }
}