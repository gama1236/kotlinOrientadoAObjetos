class TuEstado(estadoCivil:String,numerosHermano:Int) {

    val estadoCivil:String
    val numerosHermano:Int

    init {
        this.estadoCivil=estadoCivil
        this.numerosHermano=numerosHermano

    }

    override fun toString(): String {
        return "Tu estado Civil es $estadoCivil y tienes $numerosHermano hermanos"
    }
}