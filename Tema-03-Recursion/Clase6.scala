object Clase6 {

    def suma(num: Int): Int = {
        // Caso Base
        if num == 0 then 0
        // Paso Recursivo
        else num + suma(num-1)
    }

    def factorial(num: Long): Long = {
        // Caso Base
        if num == 0 then 1
        // Paso Recursivo
        else num * factorial(num-1)
    }

    var contador = 0

    def fibonacci(pos: Int): Long = {
        contador = contador + 1
        // Casos Base
        if pos == 0 then 0L
        else if pos == 1 then 1L
        else fibonacci(pos-1) + fibonacci(pos-2)
    }

    // Realizar una función que imprima los numeros de A hasta B
    // imprimir(3,10), deberia imprimir
    // 3 4 5 6 7 8 9 10

    def imprimir(A: Int, B: Int): Unit = {
        if A == B then print(s"$A ")
        else { 
            print(s"$A ")
            imprimir(A+1, B)
        }
    }

    def imprimirPuro(A: Int, B: Int): String = {
        if A == B then s"$A\n"
        else s"$A ${imprimirPuro(A+1,B)}"
    }

    def imprimirPuro(A: Int, B: Int, paso: Int): String = {
        if A > B then ""
        else s"$A ${imprimirPuro(A+paso,B,paso)}"
    }

    // Suponiendo que la base es diferente de 0
    def potencia(base: Int, exponente: Int): Long = {
        if exponente == 0 then 1L
        else base * potencia(base,exponente-1)
    }

    // Realizar una funcion llamada multiplicar(a: Int, b: Int)
    // y devuelve la multiplicacion
    // pero debe ser hecha sin usar el simbolo de *
    // recomendacion usar sumas

    def main(args: Array[String]): Unit = {
        val num: Long = 20
        println(suma(5))
        println(factorial(num))
        println(s"Fibonacci de 10 es ${fibonacci(10)} y uso la funcion recursiva $contador")
        contador = 0
        println(s"Fibonacci de 20 es ${fibonacci(20)} y uso la funcion recursiva $contador")
        contador = 0
        println(s"Fibonacci de 30 es ${fibonacci(30)} y uso la funcion recursiva $contador")
        imprimir(3,10)
        println()
        println(imprimirPuro(3,10))
        println(imprimirPuro(3,11,4))
        println(potencia(2,60))
    }
}