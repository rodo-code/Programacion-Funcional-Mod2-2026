object Clase7Strings {

    // Crear una funcion que reciba un String y le de la vuelta
    // darVuelta("Pedro") --> "ordep"
    // darVuelta("ajedrez") --> "zerdeja"

    def darVuelta(texto: String): String = {
        if texto.length() == 0 then ""
        else texto.last + darVuelta(texto.init)
    }

    def darVueltaV2(texto: String): String = {
        if texto.length() == 0 then ""
        else darVueltaV2(texto.tail) + texto.head 
    }

    // Realizar una funcion llamada contarVocales, que recibe un string en minusculas
    // y deve devolver cuantas vocales existen en el string
    // contarVocales("eucalipto") --> 5
    // contarVocales("rodolfo") --> 3
    // contarVocales("programacion") --> 4

    def contarVocales(texto: String): Int = {
        if texto.length() == 0 then 0
        else {
            val letra: Char = texto.head
            val esVocal: Boolean = letra == 'a' || letra == 'e' || letra == 'i' || letra =='o' || letra == 'u'
            if esVocal then 1 + contarVocales(texto.tail)
            else contarVocales(texto.tail)
        }
    }

    def main(args: Array[String]): Unit = {
        val curso: String = "Programación Funcional"
        println(curso.head) // .head obtiene la primera letra
        println(curso.last) // .last obtiene la ultima letra
        println(curso.init) // .init devuelve el string sin la ultima letra
        println(curso.tail) // .tail devuelve el string sin la primera letra
        println(curso(4)) // si colocamos al lado de un string (pos) 
        println(curso(10)) // nos devuelve el char en pos
        println(curso.length) // .length obtiene la longitud del string
        println(curso.substring(3)) // .substring(ini) obtiene el substring desde ini
        println(curso.substring(3,14)) // .substring(a,b) obtiene el subtring entre a y b sin incluir a b
        println(darVuelta("ajedrez"))
        println(darVueltaV2("Pedro"))
        println(contarVocales("eucalipto"))
    }
}