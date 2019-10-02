import java.nio.DoubleBuffer
//se crea un constructor con los parametros y sus tipo de datos
class Ejercicio2(nombre: String, apellido: String, codigo: Int) {
    //Se declaran las variables con sus tipo de datos
    val nombre: String
    val apellido: String
    val codigo: Int


//se inician las variables creadas con el tipo de datos que reciben como parametro de la clase
    init {
        this.nombre = nombre
        this.apellido = apellido
        this.codigo = codigo


    }
// se crea funcion para calcular el salario
    //se crea un parametro de tipo salario que es doble y se le asigna un valor por defecto
    //en caso de que quiera ser cambiado se le puede pasar como parametro cuando se instancie en el main
    //multiplica el salario base por 0.25 posteriormente se le adicciona al salario  base retornando el total al main
    fun calcularSalario(salario:Double=500000.0,incremento:Double=salario*0.25): Double {

        return  salario+incremento

    }
   /*se crea la funcion toString para llamar las variables inicializadas  y poder pintar de la manera que
    se desea  ver */
    override fun toString(): String {
        return "El empleado $nombre $apellido con el numero de codigo: $codigo"
    }


}