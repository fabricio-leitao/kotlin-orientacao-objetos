package br.com.zup.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Any){
        funcionario as Funcionario
        this.total += funcionario.bonificacao
    }

//    fun registra(funcionario: Any){
//        if(funcionario is Funcionario) {
//            this.total += funcionario.bonificacao
//        }
//    }
}