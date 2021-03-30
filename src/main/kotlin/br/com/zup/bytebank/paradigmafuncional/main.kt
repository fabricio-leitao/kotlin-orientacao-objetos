package br.com.zup.bytebank.paradigmafuncional


fun main() {
    val minhaFuncaoLambda = {
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda())
    val minhaFuncaoAnonima: () -> Unit = fun () {
        println("Executa como anonima")
    }
    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses: () -> Unit = Teste()
    println(minhaFuncaoClasses())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste(){
    println("Executa teste")
}

class Teste: () -> Unit{
    override fun invoke() {
        println("executa invoke teste")
    }

}