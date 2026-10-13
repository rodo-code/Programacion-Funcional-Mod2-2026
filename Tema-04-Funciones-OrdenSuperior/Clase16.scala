object Clase16 {
    
    def crearSaludo(saludo: String): String => String =
        nombre => s"$saludo, $nombre"

    def calcularPrecio( precio: Double, descuento: Double): Double =
        precio - precio * descuento

    def suma(a: Int)(b: Int): Int = {
        a+b
    }

    def potencia(exponente: Int)(base: Double): Double = {
        if exponente == 0 then 1
        else base * potencia(exponente-1)(base)
    }
    // Formato devolviendo una función
    def vecesAntiguo(cantidad: Int): (Int => Int) = {
        (num: Int) => num * cantidad
    }
    // Formato con currificación
    def veces(cantidad: Int)(num: Int): Int = {
        num * cantidad
    }

    // EJERCICIO 1
    // Generar una función currificada llamada limiteSuperior que reciba dos parametros
    // un limite superior y un numero y devuelva un Boolean
    // indicando si el numero es menor o igual al limiteSuperior
    // ejemplos de uso:
    // val validarNota = limiteSuperior(100)
    // validarNota(54) --> true
    // validarNota(120) --> false

    // EJERCICIO 2
    // Generar una función currificada llamada aplicarDescuento que reciba dos parametros
    // un porcentaje de descuento (Double) y un monto (Double) y devuelva un Double
    // que representa al monto aplicando el descuento
    // ejemplos de uso:
    // val descuento10 = aplicarDescuento(0.1)
    // val mitadPrecio = aplicarDescuento(0.5)
    // descuento10(90) --> 81.0
    // mitadPrecio(25) --> 12.5

    def main(args: Array[String]): Unit = {
        val saludoFormal = crearSaludo("Buenos dias")
        val saludoInformal = crearSaludo("Hola")
        println(saludoFormal("Alexis"))
        println(saludoInformal("Rodolfo"))
        val descuento10 = (precioOriginal: Double) => calcularPrecio(precioOriginal,0.1)
        println(descuento10(100))
        val suma10 = suma(10)
        println(suma(5)(7))
        println(suma10(6))
        println(potencia(4)(3)) // Esto ahora es 3 a la cuarta
        val cuadrado = potencia(2)
        val cubo = potencia(3)
        println(cuadrado(5))
        println(cubo(4))
        val dobleAntiguo = vecesAntiguo(2)
        val doble = veces(2)
        val triple = veces(3)
        println(triple(6))
    }
}