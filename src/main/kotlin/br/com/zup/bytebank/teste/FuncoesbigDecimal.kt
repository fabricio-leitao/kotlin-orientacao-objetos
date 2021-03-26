package br.com.zup.bytebank.teste

import java.math.BigDecimal
import java.math.RoundingMode


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

fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()){
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulator, valor ->
        acumulator + valor
    }
}