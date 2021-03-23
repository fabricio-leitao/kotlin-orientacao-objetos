class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    var senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
           get() = salario


    fun autenticar(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}