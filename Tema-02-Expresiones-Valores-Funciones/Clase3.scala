object Clase3{
    def main(args: Array[String]): Unit = {
        // Valor inmutable
        val nombre: String = "Rodolfo"
        val edad: Int = 27
        val esEstudiante: Boolean = false
        // Inferencia de Tipos
        // un valor/variable puede adivinar de que tipo es
        // pero se va a quedar con ese tipo
        val edadFutura = 28
        // Variables mutables
        var nota1 = 70
        nota1 = 75
        // String Interpolation
        val saludo: String = s"Hola $nombre tienes $edad años"
        // Imprimir
        println(s"Hola $nombre tienes $edad años")
        // Operaciones aritmeticas con numericos
        val a: Double = 7
        val b: Double = 9
        println(a+b)
        println(a-b)
        println(a*b)
        println(b/a)
        println(b%a)
        // Operaciones de comparacion
        println(a > b)
        println(a >= b)
        println(a < b)
        println(a <= b)
        println(a == b)
        println(a != b)
        // Operaciones con strings
        // Concatenación
        val str1: String = "Feliz dia "
        val str2: String = "de la amistad, "
        val str3: String = "del amor, "
        val str4: String = "de la primavera "
        val str5: String = "y del estudiante"
        val felicitacion = str1 + str2 + str3 + str4 + str5
        println(felicitacion)
        // Modificadores
        println(felicitacion.toUpperCase())
        println(felicitacion.toLowerCase())
        println(felicitacion.length())
        // Comparadores
        val strA = "ana"
        val strB = "boris"
        val strC = "Boris"
        println(strA < strB) // Compara en orden lexicografico
        println(strB == strC) // false, por que hay comparacion de mayusculas y minusculas
        println(strC < strB) // true, porquey mayusculas vienen antes que minisculas

        // Sacar el mayor de dos numeros`
        val mayor = if a > b then a else b
        println(if a > b then a else b)

        // Bloques de codigo
        val notaFinal = {
            val notaPonderada1 = 87*0.3
            val notaPonderada2 = 50*0.3
            val notaPonderada3 = 67*0.4
            notaPonderada1 + notaPonderada2 + notaPonderada3
        }
        println(notaFinal)

        // Condicionales compuestas
        // && AND
        // || OR
        // ! NOT
        val faltas = 2
        val aprobado = notaFinal > 60 && faltas <= 4 
        println(aprobado)
        // CONDICIONALES ANIDADOS 
        val num = -9
        val signo = if num > 0 then "POSITIVO"
            else if num < 0 then "NEGATIVO"
            else "CERO"
        val signo2 = if num <= 0 then {
            if num < 0 then "NEGATIVO"
            else "CERO"
        }
        else "POSITIVO"
        println(signo2)
        // Crear 3 valores num1, num2, num3
        // Crear un valor medio que sea igual a 
        // el número del medio si es que ordenaramos
        // num1, num2 y num3 en orden decreciente
    }
}