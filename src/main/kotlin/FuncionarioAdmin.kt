abstract class FuncionarioAdmin(
    var nome: String,
    var cpf: String,
    var salario: Double,
    val senha: Int
) {

    abstract val bonificacao: Double

    fun autenticar(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}