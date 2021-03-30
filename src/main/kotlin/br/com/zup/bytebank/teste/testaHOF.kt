package br.com.zup.bytebank.teste

import br.com.zup.bytebank.modelo.Autenticavel
import br.com.zup.bytebank.modelo.SistemaInterno
import br.com.zup.bytebank.paradigmafuncional.soma

private fun testaHOF() {
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