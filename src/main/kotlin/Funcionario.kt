abstract class Funcionario(
    var nome: String,
    var cpf: String,
    var salario: Double
) {

    abstract val bonificacao: Double

}