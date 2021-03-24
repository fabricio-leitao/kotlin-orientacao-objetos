import br.com.zup.bytebank.modelo.*
import br.com.zup.bytebank.teste.testaObjects

fun main() {

    val endereco = Endereco()

    val objeto: Any = Any()

    imprime(objeto)
    imprime(Unit)
    imprime(Any())
    imprime(1)
    imprime(1.0)
    val teste: Any = imprime(endereco)
    println(teste)
    imprime(endereco)

    testaFuncionarios()
}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}







