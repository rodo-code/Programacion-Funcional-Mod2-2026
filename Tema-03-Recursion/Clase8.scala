import scala.annotation.tailrec
object Clase8 {

    // Tapamos con un parametro por defecto
    @tailrec
    def factorial(n: Int, acum: Int = 1): Int = {
        if n == 0 then acum
        else factorial(n-1,n*acum)
    }

    // Tapamos con una funcion interna
    def factorialV2(n: Int): Int = {
        @tailrec
        def factorialV2Aux(n: Int, acum: Int): Int = {
            if n == 0 then acum
            else factorialV2Aux(n-1,n*acum)
        }
        factorialV2Aux(n,1)
    }

    @tailrec
    def suma(num: Int, acum: Int = 0): Int = {
        // Caso Base
        if num == 0 then acum
        // Paso Recursivo
        else suma(num-1,num + acum)
    }

    @tailrec
    def potencia(base: Int, exponente: Int, acum: Long = 1L): Long = {
        if exponente == 0 then acum
        else potencia(base,exponente-1,base * acum) 
    }

    // Hacer una funcion contarDigitos pero con recursion de cola
    @tailrec
    def contarDigitos(num: Int, acum: Int = 1): Int = {
        if num<10 && num>=0 then acum
        else contarDigitos(num/10,1 + acum)
    }

    @tailrec
    def contarDigitosV2(num: Int, acum: Int = 0): Int = {
        if num == 0 then acum
        else contarDigitosV2(num/10,acum+1)
    }

    @tailrec
    def imprimirPuro(A: Int, B: Int, acum: String = ""): String = {
        if A > B then acum
        else imprimirPuro(A,B-1,s"$B $acum")
    }
    // Realizar la version recursion de cola de imprimirPuro con paso
    // Puntos Extra a los que saquen sin espacio al inicio
    def imprimirConPaso(A: Int, B: Int, paso: Int, acum: String = ""): String = {
        if A > B then acum.tail
        else imprimirConPaso(A+paso,B,paso,s"$acum $A")
    }

    def main(args: Array[String]): Unit = {
        println(factorial(5))
        println(suma(5))
        println(potencia(5,4))
        println(contarDigitos(28383))
        println(contarDigitosV2(8383))
        println(imprimirPuro(5,11))
        println(imprimirConPaso(1,12,3))
    }
}