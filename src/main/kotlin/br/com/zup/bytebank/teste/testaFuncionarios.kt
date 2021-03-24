import br.com.zup.bytebank.modelo.Analista
import br.com.zup.bytebank.modelo.CalculadoraBonificacao
import br.com.zup.bytebank.modelo.Diretor
import br.com.zup.bytebank.modelo.Gerente

fun testaFuncionarios(){
    var todoroki = Analista("Todoroki", "111.222.333-44", 1000.0)

    println("nome ${todoroki.nome}")
    println("cpf ${todoroki.cpf}")
    println("salario ${todoroki.salario}")
    println("Bonificação ${todoroki.bonificacao}")

    println("----------------------------------")
    var deku = Gerente("Deku", "111.222.333-44", 2000.0, senha = 1234)

    println("nome ${deku.nome}")
    println("cpf ${deku.cpf}")
    println("salario ${deku.salario}")
    println("Bonificação ${deku.bonificacao}")

    if(deku.autenticar(1234)){
        println("Autenticação com sucesso!")
    } else {
        println("Auntenticação falhou!")
    }

    println("---------------------------------")
    var uraraka = Diretor("Uraraka", "123.123.123-12", 4000.0, 1234, 200.0)

    println("Nome ${uraraka.nome}")
    println("CPF ${uraraka.cpf}")
    println("Salario ${uraraka.salario}")
    println("Bonificação ${uraraka.bonificacao}")
    println("Participação nos lucros ${uraraka.plr}")

    if(uraraka.autenticar(1234)){
        println("Autenticação com sucesso!")
    } else {
        println("Auntenticação falhou!")
    }

    val kurama = Analista(nome = "Kurama", cpf = "555.555.555-55", salario = 3000.0)


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(todoroki)
    calculadora.registra(deku)
    calculadora.registra(uraraka)
    calculadora.registra(kurama)

    println("Total de bonificação: ${calculadora.total}")


}