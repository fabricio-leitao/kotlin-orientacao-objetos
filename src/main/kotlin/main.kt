import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios.map { salario -> calculaAumentoRelativo(salario, aumento)
    }.toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)
}

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

//vararg é um tipo especial do kotlin onde podemos passar variáveis para uma função
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulator, valor ->
        acumulator + valor
    }
}