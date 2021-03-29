package br.com.zup.bytebank.collections

fun main() {

    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("Alex", "Paulo", "Maria")
//    val assistiramAmbos: Set<String> = assistiramCursoKotlin.plus(assistiramCursoAndroid)
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    println(assistiramAmbos)

}

