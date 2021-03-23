open class Funcionario(
    var nome: String,
    var cpf: String,
    var salario: Double
) {
//    open val bonificacao: Double
//        get() {
//            return salario * 0.1
//        }

    open fun bonificacao(): Double = salario * 0.1

//    open val bonificacao: Double get() = salario * 0.1
}