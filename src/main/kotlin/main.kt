fun main() {
    println("Bem vindo ao Bytebank!")


    var todoroki = Funcionario("Todoroki", "111.222.333-44", 1000.0)

    println("nome ${todoroki.nome}")
    println("cpf ${todoroki.cpf}")
    println("salario ${todoroki.salario}")
    println("Bonificação ${todoroki.bonificacao()}")

    println("----------------------------------")
    var deku = Gerente("Deku", "111.222.333-44", 2000.0, senha = 1234)

    println("nome ${deku.nome}")
    println("cpf ${deku.cpf}")
    println("salario ${deku.salario}")
    println("Bonificação ${deku.bonificacao()}")

    if(deku.autenticar(1234)){
        println("Autenticação com sucesso!")
    } else {
        println("Auntenticação falhou!")
    }
}




