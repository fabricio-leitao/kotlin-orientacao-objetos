import br.com.zup.bytebank.modelo.*
import br.com.zup.bytebank.teste.testaObjects

fun main() {

    val endereco = Endereco()
    val objeto: Any = Any()

    imprime(objeto)
    imprime(1)
    imprime(1.0)
    val teste: Any = imprime(endereco)
    println(teste)
}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
} 







