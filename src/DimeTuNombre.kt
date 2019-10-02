class DimeTuNombre(nombre:String) {
    val nombre:String

    init {
        this.nombre=nombre
    }

    override fun toString(): String {
        return "hola $nombre feliz dia"
    }
}