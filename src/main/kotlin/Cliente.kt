class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int
): Autenticavel {

    override fun autenticar(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}