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

    println(pedidos + Pair(7, 70.0))
    println(pedidos + mapOf(8 to 90.0, 9 to 20.0))

    println(pedidos - 6)
    println(pedidos - listOf(6, 5))

    pedidos.putAll(setOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0))
    println(pedidos)
    pedidos.putAll(listOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0))
    println(pedidos)
    pedidos += (listOf<Pair<Int, Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0))
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}

