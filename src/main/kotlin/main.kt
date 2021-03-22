fun main() {
    println("Bem vindo ao Bytebank!")

    val contaTodoroki = Conta()
    contaTodoroki.titular = "Todoroki"
    contaTodoroki.numeroConta = 123
    contaTodoroki.saldo = 200.0

    val contaDeku = Conta()
    contaDeku.titular = "Deku"
    contaDeku.numeroConta = 134
    contaDeku.saldo = 300.0

    println(contaTodoroki.titular)
    println(contaTodoroki.numeroConta)
    println(contaTodoroki.saldo)
    println("--------------------")
    println(contaDeku.titular)
    println(contaDeku.numeroConta)
    println(contaDeku.saldo)
}

class Conta(){
    var titular = ""
    var numeroConta = 0
    var saldo = 0.0
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo positivo!")
        saldo == 0.0 -> println("Saldo neutro!")
        else -> println("Saldo negativo!")
    }
}

fun testaLacos(){
//        Ordem crescente
    for (i in 1..5){
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