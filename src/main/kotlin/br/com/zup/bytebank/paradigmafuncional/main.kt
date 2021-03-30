package br.com.zup.bytebank.paradigmafuncional

import br.com.zup.bytebank.modelo.Autenticavel
import br.com.zup.bytebank.modelo.Endereco
import br.com.zup.bytebank.modelo.SistemaInterno


fun main() {
//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)
    Endereco(logradouro = "rua vergueiro", numero = 3185).let { endereco ->
        "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
    }.let(::println)
//    }    }.let { enderecoEmMaiusculo ->
//        println(enderecoEmMaiusculo)
//    }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter (predicate = { endereco -> endereco.complemento.isNotEmpty() }).let(block = (::println))

    soma(1, 5, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autenticar(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento")
    })
}

fun soma(a:Int, b:Int, resultado: (Int) -> Unit){
    println("antes da soma")
    resultado(a + b)
    println("depois da soma")
}