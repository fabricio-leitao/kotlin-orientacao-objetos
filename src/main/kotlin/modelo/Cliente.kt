package modelo

import modelo.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    override val senha: Int
): Autenticavel {

}