class Tienda(nombreCliente: String="Stiven", codigoVenta: Int=112312321) {
    val nombreCliente: String
    var codigoVenta: Int

    init {
        this.nombreCliente = nombreCliente
        this.codigoVenta = codigoVenta

    }

    override fun toString(): String {
        return "el cliente ${nombreCliente} con el codigo # ${codigoVenta}"
    }

    fun calcularCompra (cantidadBanano:Int,valorBanano:Int=350):Int=cantidadBanano*valorBanano
}