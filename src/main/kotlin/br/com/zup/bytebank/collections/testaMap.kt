package br.com.zup.bytebank.collections

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }

    pedidos[4] = 70.0
    println(pedidos)

    pedidos.put(5, 80.0)
    println(pedidos)

    pedidos[1] = 100.0
    println(pedidos)

    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    //Apenas insere se não existir essa chave
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)

    //Somente remove se os valores são iguais
    pedidos.remove(3, 100)
    println(pedidos)
}