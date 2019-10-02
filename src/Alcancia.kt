class Alcancia {

    val monedaq:Int =500
    val monedac:Int =500
    val monedad:Int =500
    operator fun invoke (cantidadQ:Int=0,cantidadD: Int=0,cantidadC:Int=0):Int{

        return  (cantidadQ*monedaq)+(cantidadD*monedad)+(cantidadC*monedac)

    }
}