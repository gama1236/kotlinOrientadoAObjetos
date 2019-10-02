class Estudiante {

    fun notasEstudiante(nota1:Double=3.5,nota2:Double=4.3,nota3:Double=3.7):Double{
        val notaFinal = (nota1*0.25)+(nota2*0.35)+(nota3*0.4)
        return notaFinal
    }

}