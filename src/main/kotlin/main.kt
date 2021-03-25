import br.com.zup.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun main() {
    var endereco: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "prédio")
    val logradouroNovo: String? = endereco?.logradouro
    endereco?.let {
        println(endereco?.logradouro?.length)
        val tamanhoComplemento: Int = it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }

    teste("")
    teste(1)
}

fun teste(valor: Any) {
    val numero: Int? = valor as? Int
    println(numero)
}

