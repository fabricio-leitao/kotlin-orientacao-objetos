import br.com.zup.bytebank.modelo.Cliente
import br.com.zup.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "Joao", cpf = "", senha = 1)

    val contaJoao = ContaCorrente(joao, 100)
    contaJoao.titular.nome = "João"
    var contaMaria = contaJoao
    contaMaria.titular.nome = "Maria"

    println("titular da conta ${contaJoao.titular}")
    println("titular da conta ${contaMaria.titular}")
}
