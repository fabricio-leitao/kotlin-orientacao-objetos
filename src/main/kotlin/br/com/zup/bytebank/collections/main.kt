package br.com.zup.bytebank.collections

fun main() {

    //Collection, List e Iterable
    //listOf, setOf
    val nomes: Collection<String> = setOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    for(nome in nomes){
        println(nome)
    }

    println(nomes)
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")
}