package br.com.zup.bytebank.collections

fun main() {

    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    )

//    val valorPedido = pedidos.get(5)
//    println(valorPedido)
//    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)

    val mensagem: Double? = pedidos.getOrElse(0, {
        0.0
    })
    println(mensagem)
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(1, -1.0))

    println(pedidos.keys)

    for (numerosDePedido in pedidos.keys){
        println("Pedido $numerosDePedido")
    }

    println(pedidos.values)

    for(valor in pedidos.values){
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }

    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)
}

