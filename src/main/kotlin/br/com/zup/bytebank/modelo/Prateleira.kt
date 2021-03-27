package br.com.zup.bytebank.modelo

data class Prateleira (
    val genero: String,
    val livros: List<Livro>
){
    fun organizarPorAutor(): List<Livro>{
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro>{
        return livros.sortedBy { it.anoPublicacao }
    }
}