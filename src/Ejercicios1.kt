class Ejercicios1 {
    fun numerosAlCuadrado(a: Int): Int {
        return a * a
    }

    fun metroACentimietros(metros: Int, centimentros: Int = 100): Double {
        return metros / centimentros.toDouble()

    }

    fun puldagaACentimetros(centimentros: Int, pulgadas: Double = 2.54): Double {
        return centimentros * pulgadas
    }

    fun celciosAFarenheit(celcios: Double): Double {
        return (9 / 5 * celcios) + 32
    }
    fun sumaDosNumers(a:Double,b:Double) = a+b
    fun restaDosNumeros(a:Double,b:Double)= a-b
    fun multiplicaDosNumeros(a:Double,b: Double)=a*b
    fun divideDosNumeros(a:Double,b: Double)=a/b


}