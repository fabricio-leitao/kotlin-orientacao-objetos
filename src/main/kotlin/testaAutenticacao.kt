fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Todoroki",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )

    val diretora = Diretor(
        nome = "Uraraka",
        cpf = "222.111.111-11",
        salario = 2000.0,
        senha = 2000,
        plr = 200.0
    )

    val takeru = Cliente(
        nome = "Takeru",
        cpf = "123.123.123-54",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
}
