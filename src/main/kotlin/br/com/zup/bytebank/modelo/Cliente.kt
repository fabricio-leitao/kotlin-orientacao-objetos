package br.com.zup.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    val endereco: Endereco = Endereco(),
    override val senha: Int
): Autenticavel {

}