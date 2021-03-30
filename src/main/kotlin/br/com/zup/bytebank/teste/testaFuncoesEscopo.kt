package br.com.zup.bytebank.teste

import br.com.zup.bytebank.modelo.Endereco

public fun testaFuncoesEscopo() {
    //    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)
//    Endereco(logradouro = "rua vergueiro", numero = 3185).run {
//        "${logradouro}, ${numero}".toUpperCase()
////    }.let(::println)
//    }.let { enderecoEmMaiusculo: String ->
//        println(enderecoEmMaiusculo)
//    }

    run {
        println("Execução do run sem extensão")
    }

    val endereco = Endereco()
        .also { println("Criando endereço") }
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }

    with(endereco) {
        "${logradouro}, ${numero}".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    ).filter(predicate = { endereco -> endereco.complemento.isNotEmpty() }).let(block = (::println))

}
