fun main() {
    val idade1 = 25
    val idade2 = 19
    val idade3 = 33

    val maiorIdade = if(idade1 > idade2 && idade1 > idade3){
        idade1
    } else if (idade2 > idade3){
        idade2
    } else{
        idade3
    }

    println(maiorIdade)

    val idades = IntArray(4)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20
}



