object Clase14 {

    // FUNCION DE ORDEN SUPERIOR
    // Es una funcion que recibe una o varias funciones como parametro
    // o que devuelve una funcion como resultado
    def sumarTransformadas(a: Int, b: Int, transformacion: Int => Int): Int = {
        transformacion(a) + transformacion(b)
    }

    // EJERCICIO 1
    // Crear una funcion de orden superior llamada calcular que reciba 3 parametros
    // 1. Funcion del tipo (Int, Int) => Int
    // 2. Un Int
    // 3. Un Int
    // La función calcular debe aplicar la función del primer parametro a los otros
    // 2 parametros
    // EJEMPLOS
    // calcular(suma,4,9) => 13
    // calcular(resta,3,1) => 2
    // calcular(multiplicacion,8,5) => 40
    // calcular(division,7,3) => 2
    // calcular(modulo,7,3) => 1

    def calcular(funcion: (Int, Int) => Int, a: Int, b: Int): Int = {
        funcion(a,b)
    }

    def convertirDolaresABolivianos(montoDolares: Double, obtenerTipoDeCambio: () => Double): Double = {
        montoDolares * obtenerTipoDeCambio()
    }

    def veces(cantidad: Int): (Int => Int) = {
        (num: Int) => num * cantidad
    }

    def validarMinimo(minimo: Int): (Int => Boolean) = {
        (num: Int) => num >= minimo
    }

    def elevado(potencia: Int): (Int => Int) = {
        def pow(a: Int, b: Int): Int = {
            if b == 0 then 1
            else a * pow(a,b-1)
        } 
        (num: Int) => pow(num,potencia)
    }

    def main(args: Array[String]): Unit = {

        val duplicarAntiguo = (num: Int) => num * 2
        val duplicar = veces(2)
        val triplicarAntiguo: Int => Int = num => num * 3
        val triplicar = veces(3)
        val cuadradoAntiguo: Int => Int = num => num * num
        println(sumarTransformadas(5,8,duplicar))
        println(sumarTransformadas(2,6,triplicar))
        println(sumarTransformadas(3,7,cuadradoAntiguo))
        println(sumarTransformadas(3,2,(num: Int) => num*num*num))
        println(calcular((a,b)=>a+b,6,3))
        println(calcular((a,b)=>a*b,6,3))
        // Funciones que no reciben 
        val obtenerTipoDeCambio: () => Double = () => 11.87
        println(convertirDolaresABolivianos(100,obtenerTipoDeCambio))
        // Usando validarMinimo para crear funciones que validen datos
        val esMayorEdad = validarMinimo(18)
        val esAdultoMayor = validarMinimo(60)
        val puedeIrAlColegio = validarMinimo(5)
        println(esMayorEdad(17))
        println(esAdultoMayor(70))
        println(puedeIrAlColegio(3))
        /*
            EJERCICIO 2

            Crear una funcion de orden superior llamada elevado
            que reciba un numero y genere una función que reciba un
            Int y devuelva un Int.

            val cuadrado = elevado(2)
            val cubo = elevado(3)
            cuadrado(5) => 25
            cubo(4) => 64
        */
        val cuadrado = elevado(2)
        val cubo = elevado(3)
        println(cuadrado(5))
        println(cubo(4))
        println(elevado(5)(2))
    }
}