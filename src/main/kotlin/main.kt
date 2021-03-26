fun main() {

    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("Média: $media")

    //All retorna se true se todos forem true
    val todosMaiores = idades.all { it > 18 }
    println("Todos maiores? $todosMaiores")

    //Any retorna se ao menos 1 existe
    val existeMaior = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    val busca = idades.find { it >= 18 }
    println("Busca: $busca")
}