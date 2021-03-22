class Gerente(
    var nome: String,
    var cpf: String,
    var salario: Double,
    var senha: Int
) {
    fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autenticar(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }
}