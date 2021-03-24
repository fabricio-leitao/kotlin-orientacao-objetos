package modelo

import modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autenticar(senha)){
            println("Bem vindo ao ByteBank!")
        }else {
            println("Falha na autenticação!")
        }
    }
}