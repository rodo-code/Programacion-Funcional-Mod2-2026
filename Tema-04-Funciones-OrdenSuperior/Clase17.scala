object Clase17 {

    def sumarUno(num: Double) = {
        num+1
    }

    def cubo(num: Double) = {
        num*num*num
    }

    def main(args: Array[String]) = {
        val f = (num: Double) => num*num
        val g = (num: Double) => num+4
        println(f(g(3)))
        println(g(f(3)))
        // COMPOSE
        val transformacion = sumarUno.compose(cubo).compose(sumarUno)
        val res = transformacion(5)
        val transformacion2 = cubo.compose(sumarUno).compose(sumarUno)
        val res2 = transformacion2(2)
        println(res)
        println(res2)
        // AND THEN
        val transformacion3 = cubo.andThen(sumarUno).andThen(sumarUno)
        println(transformacion3(3))
        // TENER CUIDADO CON EL DOMINIO Y RANGO DE LA FUNCION
        val longitud = (texto: String) => texto.length()
        val esPar = (num: Int) => num%2 == 0
        // Composicion Manual
        println(esPar(longitud("caballo")))
        // Compose 
        println(esPar.compose(longitud)("patito"))
        // andThen
        println(longitud.andThen(esPar)("tornados"))

        // EJERCICIO 1
        // Crear tres funciones 
        // La primera que sume 3 a un número Int
        // La segunda que obtenga el digito de las unidades de un número
        // La tercera que eleve un número al cuadrado
        // Crear una funcion compuesta por las 3, que:
        // 1. Primero eleve un número al cuadrado
        // 2. Luego obtenga el digito de las unidades del número
        // 3. Finalmente sume 3 al digito obtenido

        val suma3 = (num: Int) => num+3
        val cuadrado = (num: Int) => num*num
        val ultimoDigito = (num: Int) => num%10
        
        println(suma3(ultimoDigito(cuadrado(7))))
        println(suma3.compose(ultimoDigito).compose(cuadrado)(7))
        println(cuadrado.andThen(ultimoDigito).andThen(suma3)(7))

        // EJERCICIO 2
        // Hacer una funcion de orden superior llamada aplicarNVeces 
        // que reciba una funcion y un numero N
        // y de como resultado una funcion que aplique N veces la funcion enviada
        def aplicarNVeces(funcion: (Int => Int), N: Int): (Int => Int) = {
            if N == 0 then (num: Int) => num
            else funcion.andThen(aplicarNVeces(funcion,N-1))
        }

        val cincoVecesSuma3 = aplicarNVeces(suma3,5)
        val dosVecesCuadrado = aplicarNVeces(num => num*num,2)
        println(cincoVecesSuma3(6))
        println(dosVecesCuadrado(3))
    }
}