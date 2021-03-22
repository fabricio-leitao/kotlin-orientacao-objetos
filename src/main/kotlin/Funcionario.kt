class Funcionario(
    var nome: String,
    var cpf: String,
    var salario: Double,
    var tipo: Int //0- Funcionario, 1- Gerente, 2- Diretor
) {
    fun bonificacao(): Double {
        when (tipo) {
            0 -> {
                return salario * 0.1
            }
            1 -> {
                return salario * 0.2
            }
            else -> {
                return salario * 0.3
            }
        }
    }
}