import java.lang.NumberFormatException

fun main(args: Array<String>) {


    val ejercicios1_1 = Ejercicios1()

    do {
        var numero: Double?

        println("ingrese un numero")
        numero = try {
            readLine()?.toDouble()
        } catch (e: NumberFormatException) {
            null
        }



        if (numero != null) {

            println("Resultado de numeros al cuadrado " + ejercicios1_1.numerosAlCuadrado(numero!!.toInt()))
            println("-------------------------------------------------------------")
            println("Resultado de metros a centimetros " + ejercicios1_1.metroACentimietros(numero!!.toInt()))
            println("-------------------------------------------------------------")
            println("Resultado de centimetros a pulgada " + ejercicios1_1.puldagaACentimetros(numero!!.toInt()))
            println("-------------------------------------------------------------")
            println("Resultado de metros a centigrados a fahrenheit " + ejercicios1_1.celciosAFarenheit(numero))
            println("-------------------------------------------------------------")
            println("Resultado de la suma de sus dos numeros " + ejercicios1_1.sumaDosNumers(numero,numero))
            println("Resultado de la resta de sus dos numeros " + ejercicios1_1.restaDosNumeros(numero,numero))
            println("Resultado de la multiplicacion de sus dos numeros " + ejercicios1_1.multiplicaDosNumeros(numero,numero))
            println("Resultado de la division de sus dos numeros " + ejercicios1_1.divideDosNumeros(numero, numero))


        } else {
            println("No has ingresado un numero")
        }
    } while (numero == null)
    //Ejercicio 2
    //Ejercicio 1

    val ejercicios2 = Ejercicio2("Stinven","castro",123)
    //llama a la funcioj toString que contiene los datos iniciados del constructor
    //llama a la funcion calcular salario que tiene un parametro por defecto pero se le puede pasar  otro valor para
    //calcular el aumento del 25% del salario base
    println(ejercicios2.toString() + " venga un nuevo salario de  "+ejercicios2.calcularSalario(1000000.0))

    // llamo la clase Estudiante y se la asigno a  una variable de tipo val llamada notas
    //val notas = Estudiante()
    //llamo la funcion de notas de estudiate mendiante notas.nombreDeLaFuncion
    // por defecto el estudiante tiene notas asignadas en el parametro, pero puedes calcular las notas con los porcentajes existentes
   //meto  la funcion llamada en un metodo de impresion como  println
    //si quieres pintar de mejor manera el resultado acuerdate que el println puedes escribir texto concatenando con un +

    //println("la nota del estudiante es: "+notas.notasEstudiante(5.0,5.0,5.0))(
    val tienda = Tienda("Diego Paredes",123)
    println(tienda.toString()+" compro $"+tienda.calcularCompra(20,500)+" de bananos")


    val triangulito = Triangulo()
    println("el area del triandulo es: "+triangulito.areaTriangulo(2.0,3.0))


    val dimeCentimetros = MetroACentimetro()
    println("Tu cantidad de metros en centimetros es: "+dimeCentimetros.metroACentimetro(2.0))

    val salarito = Vendedor("stiven","castro")
    println(salarito.toString()+" "+ salarito.calcularVenta())



    val monedera = Alcancia()
    var misMonedas = monedera.invoke()
    if (misMonedas==0){
       println( "$${misMonedas} que pesar :C no tienes dinero vuelve en otra ocacion")
    }else{
       println( "tienes esta ${misMonedas} cantidad de dinero que afortunado")
    }
    val dimetunombre = DimeTuNombre("stiven")
    println(dimetunombre.toString())


    val miEstado = TuEstado("soltero",3)
    println(miEstado.toString())




    val totalCulacuadro=AreTotal()
    println(totalCulacuadro.area(2.0))

}





