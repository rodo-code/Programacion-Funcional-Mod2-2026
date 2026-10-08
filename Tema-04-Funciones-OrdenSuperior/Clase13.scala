object Clase13 {

    // Formato Clasico de Funciones
    def min(a: Int, b: Int): Int = {
        if a<b then a else b
    }

    def main(args: Array[String]): Unit = {
        // Formato con especificacion de tipo de parametros
        val menor = (a: Int, b: Int) => if a<b then a else b
        // Formato con especificacion de tipo de funcion
        val minimo: (Int, Int) => Int = (a,b) => if a<b then a else b
        val esPar = (num: Int) => num%2 == 0
        val esMultiplo3: Int => Boolean = num => num%3==0
        val resultadoMateria: (Double, Int, Int) => String = (notaFinal, faltas, creditos) => {
            if notaFinal > 60 && faltas <= creditos then "APROBADO"
            else "REPROBADO"
        }
        println(esPar(6))
        println(esPar(11))
        println(resultadoMateria(65,2,4))
        println(resultadoMateria(75,5,4))
        // EJERCICIO 1
        // Crear una funcion que reciba un texto y devuelve el texto 
        // sin el ultimo caracter y sin el primer caracter
        // Hacerlo en formato con especificacion de tipo de funcion
        val cortar: String => String = cadena => if cadena.length()<=1 then "" else cadena.tail.init
        println(cortar("funcional"))
        println(cortar("u"))
        val intercambiar = (a: Int, b: Int ) => (b,a)
        println(intercambiar(10,5))
        val aumentarTiempo = (hora: Int, minuto: Int, aumentoMinutos: Int) => {
            val nuevaHora = (hora + ((minuto+aumentoMinutos)/60))%24
            val nuevoMinuto = (minuto+aumentoMinutos)%60
            (nuevaHora,nuevoMinuto)
        }
        println(aumentarTiempo(9,29,6))
        println(aumentarTiempo(9,45,30))
        println(aumentarTiempo(23,50,20))
        println(aumentarTiempo(9,29,1450))
        lazy val factorial: Int => Int = numero => {
            if numero <= 0 then 1
            else numero*factorial(numero-1)
        }
        println(factorial(6))
    }
}