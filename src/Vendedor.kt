class Vendedor (nombre:String, apellido:String ) {
    val nombre:String
    val apellido:String

    init {
        this.nombre=nombre
        this.apellido=apellido
    }

    override fun toString(): String {
        return "el vendedor $nombre $apellido"
    }

    fun calcularVenta(sueldoVasico:Double=400000.0,montoVendido:Double=2500000.0*0.15):Double{
        return  sueldoVasico + montoVendido

    }
}