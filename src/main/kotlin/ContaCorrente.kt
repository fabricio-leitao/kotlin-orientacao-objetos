class ContaCorrente(
    titular: String,
    numeroConta: Int
) : Conta(
    titular = titular,
    numeroConta = numeroConta
) {
    override fun saca(valor: Double) {
        val valorComtaxa = valor + 0.1
        super.saca(valorComtaxa)
    }
}