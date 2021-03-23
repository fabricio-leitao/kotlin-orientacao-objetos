class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    var senha: Int,
    var plr: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override fun bonificacao(): Double {
            return salario * 0.3
        }

    fun autenticar(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}