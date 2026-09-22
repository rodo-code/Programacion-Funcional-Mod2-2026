object Clase4 {

    // Es una funcion NO PURA porque...
    // 1. No devuelve ningun resultado
    // 2. Solo hace un efecto secundario
    def saludar(nombre: String): Unit = {
        println(s"Hola $nombre")
    }

    // Ahora una funcion pura
    // 1. Si le envio los mismos parametros, me devuelve siempre el mismo resultado
    // 2. No produce efectos secundarios
    def saludarPuro(nombre: String): String = { 
        s"Hola $nombre"
    }

    def maximo(a: Int, b: Int): Int = {
        if a > b then a
        else b
    }

    def minimo(a: Int, b: Int): Int = {
        if a < b then a
        else b
    }

    def medio(a: Int, b: Int, c: Int): Int = {
        val mayor = maximo(a,maximo(b,c))
        val menor = minimo(minimo(a,b),c)
        a + b + c - mayor - menor
    }

    // Scope
    val PI: Double = 3.141592
    def areaCirculo(radio: Double) = {
        PI * radio * radio
    }

    def resultadoMateria(notaFinal: Double, faltas: Int, creditos: Int = 4): String = {
        if notaFinal > 60 && faltas <= creditos then {
            val mensaje = "APROBADO"
            mensaje
        }
        else {
            val mensaje = "REPROBADO"
            mensaje
        }
    }

    def main(args: Array[String]): Unit = {
        println(saludarPuro("Leyna"))
        println(maximo(5,9))
        println(minimo(4,8))
        println(medio(1,4,9))
        println(medio(3,1,9))
        println(medio(1,10,5))
        println(areaCirculo(3))
        println(resultadoMateria(67,4))
    }

    // Abrir un nuevo archivo de Scala y crear las siguientes funciones
    // 1. Crear una función que calcule el doble de un número entero.
    // 2. Crear una función que calcule el triple de un número entero.
    // 3. Crear una función que reciba la base y la altura de un rectángulo y devuelva su área.
    // 4. Crear una función que reciba tres notas y calcule el promedio.
    // 5. Crear una función que reciba un promedio y determine si el estudiante aprobó considerando una nota mínima de 60.
    // En el main hacer
    // 6. Utilizar las funciones anteriores para evaluar al menos tres estudiantes diferentes.
    // 7. Mostrar para cada estudiante el promedio obtenido y si aprobó o reprobó.
    // 8. Utilizar únicamente valores declarados con val.
}