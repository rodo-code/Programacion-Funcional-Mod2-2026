import scala.annotation.tailrec
object Clase18 {

    def sumarDigitos(num: Int): Int = {
        if num == 0 then 0
        else (num%10)+sumarDigitos(num/10)
    }

    def sumarDigitosNumeros(a: Int, b: Int) = {
        val sumaDigitosA = sumarDigitos(a)
        val sumaDigitosB = sumarDigitos(b)
        sumaDigitosA + sumaDigitosB
    }

    def sumarTransformadas(a: Int, b: Int, transformacion: (Int => Int)): Int = {
        transformacion(a) + transformacion(b)
    }

    def operarTransformadas(
        a: Int, 
        b: Int, 
        transformacion: (Int => Int),
        operacion: (Int, Int) => Int ): Int = {
            operacion(transformacion(a),transformacion(b))
        }

    def max(a: Int, b: Int): Int = {
        if a > b then a else b
    }

    def mayorDigito(num: Int): Int = {
        @tailrec
        def mayorDigitoAux(num: Int, mayor: Int = 0): Int = {
            if num==0 then mayor
            else mayorDigitoAux(num/10,max(mayor,num%10))
        }
        mayorDigitoAux(num)
    }
    

    def main(args: Array[String]) = {
        println(sumarDigitosNumeros(234,156))
        println(sumarTransformadas(234,156,sumarDigitos))
        println(operarTransformadas(234,156,sumarDigitos,(a,b)=>a+b))
        // EJERCICIO 1
        // USAR LA ABSTRACCION FUNCIONAL OPERAR TRANSFORMADAS PARA OBTENER 
        // DE DOS NUMEROS ENTEROS CUAL DE ELLOS TIENE EL DIGITO MAYOR
        // transformacion -> Es una funcion que obtiene el digito mayor de un numero
        // operacion -=> Es una funcion que de dos numeros obtiene el mayor
        println(operarTransformadas(745,291,mayorDigito,max))
    }
}