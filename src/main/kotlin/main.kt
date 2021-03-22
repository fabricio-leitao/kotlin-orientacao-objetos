fun main() {
    println("Bem vindo ao Bytebank!")


    var todoroki = Funcionario("Todoroki", "111.222.333-44", 1000.0, 2)

    println("nome ${todoroki.nome}")
    println("cpf ${todoroki.cpf}")
    println("salario ${todoroki.salario}")
    println("Bonificação ${todoroki.bonificacao()}")
}




