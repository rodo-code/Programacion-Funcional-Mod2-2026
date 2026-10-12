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

    def vecesAntiguo(cantidad: Int): (Int => Int) = {
        (num: Int) => num * cantidad
    }

    def veces(cantidad: Int)(num: Int): Int = {
        cantidad*num
    }

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
        val doble = veces(2)
        val triple = veces(3)
        println(triple(6))
    }
}