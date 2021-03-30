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

    val calculaBonificacao: (Double) -> Double = lambda@{ salario ->
        if(salario > 1000.0){
            return@lambda salario + 50
        }
        return@lambda salario + 100.0
    }

    println(calculaBonificacao(1100.0))

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if(salario > 1000.0){
            return salario + 50
        }
        return salario + 100.0
    }

    println(calculaBonificacaoAnonima(1100.0))
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