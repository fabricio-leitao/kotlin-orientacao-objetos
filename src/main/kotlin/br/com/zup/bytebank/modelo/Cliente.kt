package br.com.zup.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    override val senha: Int
): Autenticavel {

}