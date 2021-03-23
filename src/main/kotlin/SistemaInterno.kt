class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int){
        if(admin.autenticar(senha)){
            println("Bem vindo ao ByteBank!")
        }else {
            println("Falha na autenticação!")
        }
    }
}