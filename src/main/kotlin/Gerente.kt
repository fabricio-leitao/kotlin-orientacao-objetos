class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    var senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

//    fun bonificacao(): Double {
//        return salario * 0.2
//    }

    fun autenticar(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}