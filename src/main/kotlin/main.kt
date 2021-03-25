import br.com.zup.bytebank.modelo.Endereco

fun main() {
    var endereco: Endereco? = Endereco(logradouro = "rua vergueiro")
    val logradouroNovo: String? = endereco?.logradouro
    println(endereco?.logradouro?.length)
    endereco = null
    endereco?.let {endereco: Endereco? ->
        println(endereco?.logradouro?.length)
    }
}

