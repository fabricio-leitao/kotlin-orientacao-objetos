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