class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
), Autenticavel {

    override val bonificacao: Double
           get() = salario

    override fun autenticar(senha: Int): Boolean {
        return super<Autenticavel>.autenticar(senha)
    }
}