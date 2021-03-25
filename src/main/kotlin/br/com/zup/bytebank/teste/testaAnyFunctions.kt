package br.com.zup.bytebank.teste

import br.com.zup.bytebank.modelo.Endereco

fun testaAnyFunctions() {
    val endereco = Endereco(
        logradouro = "Rua dos cravos",
        complemento = "Apartamento",
        cep = "00000-000"
    )

    val enderecoNovo = Endereco(
        bairro = "Cafundós de Judas",
        numero = 970,
        cep = "00000-000"
    )
    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco.toString())
    println(enderecoNovo.toString())

    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")
}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}