package br.com.zup.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    val endereco: Endereco = Endereco(),
    val senha: Int
): Autenticavel {
    override fun autenticar(senha: Int): Boolean {
        if (this.senha == senha) {
            println("Autenticado com sucesso!")
            return true
        } else {
            println("Falha na autenticação")
            return false
        }
    }
}