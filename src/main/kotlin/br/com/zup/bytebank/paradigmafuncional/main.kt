package br.com.zup.bytebank.paradigmafuncional


fun main() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
    val minhaFuncaoClasses: () -> Unit = Teste()
    println(minhaFuncaoClasses())
}

fun teste(){
    println("Executa teste")
}

class Teste: () -> Unit{
    override fun invoke() {
        println("executa invoke teste")
    }

}