abstract class Funcionario(
    var nome: String,
    var cpf: String,
    var salario: Double
) {

    open val bonificacao: Double
        get() {
            return salario * 0.1
        }

}