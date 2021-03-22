fun main(){
    println("Bem vindo ao Bytebank!")

    val titular: String = "Todoroki"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

    saldo = 100.0
    saldo += 200

    println("titular: $titular")
    println("número da conta: $numeroConta")
    println("Saldo da conta: $saldo")

    when {
        saldo > 0.0 -> {
            println("Saldo positivo!")
        }
        saldo == 0.0 -> {
            println("Saldo neutro!")
        }
        else -> {
            println("Saldo negativo!")
        }
    }

//    when {
//        saldo > 0.0 -> println("Saldo positivo!")
//        saldo == 0.0 -> println("Saldo neutro!")
//        else -> println("Saldo negativo!")
//    }

//    if(saldo > 0.0){
//        println("Saldo positivo!")
//    } else if(saldo == 0.0){
//        println("Saldo neutro!")
//    } else{
//        println("Saldo negativo!")
//    }
}