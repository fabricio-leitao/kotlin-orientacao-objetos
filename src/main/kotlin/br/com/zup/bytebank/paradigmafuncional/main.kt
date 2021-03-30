package br.com.zup.bytebank.paradigmafuncional


fun main() {
//    println(testaTipoFuncaoReferencia())
//    println(testaTipoFuncaoClasse())
    val minhaFuncaoLambda = { a: Int, b: Int ->
        a + b
    }
    println(minhaFuncaoLambda(15, 10))

    val minhaFuncaoAnonima = fun (a: Int, b: Int): Int {
        return a + b
    }
    println(minhaFuncaoAnonima(20, 10))
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasses: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasses(5, 10))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(5, 10))
}

fun soma(a: Int, b: Int) : Int{
    return a + b
}

class Soma: (Int, Int) -> Int{
    override fun invoke(a: Int, b: Int): Int = a + b

}