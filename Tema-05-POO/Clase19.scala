object Configuracion {
    val nombreAplicacion: String = "Sistema de Ventas"
    val versionAplicacion: String = "1.0"
    def obtenerNombreCompleto(): String = {
        s"$nombreAplicacion $versionAplicacion"
    } 
}

class Product private( // private evita que pueda crear un objeto desde un lugar fuera de la clase o del objeto acompañante
    val nombre: String,
    val precio: Double,
    val stock: Int
){
    def calcularPrecioConImpuesto(): Double = {
        precio + (precio * Product.IVA)
    }
}

// Objeto acompañante de Producto
object Product {
    val IVA: Double = 0.13
    def apply(nombre: String, precio: Double, stock: Int = 0): Product = {
        if precio < 0 then  new Product(nombre,0.0,stock)
        else new Product(nombre,precio,stock)
    }
}

object Calculadora {
    def apply(a: Int, b: Int) = a+b
    def resta(a: Int, b: Int) = a-b
}

class Vector(
    val x: Double,
    val y: Double
) {
    def +(otro: Vector): Vector = {
        new Vector(x + otro.x, y + otro.y)
    }
    
    def -(otro: Vector): Vector = {
        new Vector(x - otro.x, y - otro.y)
    }

    def productoRaro(otro: Vector): Vector = {
        new Vector(x * otro.x, y * otro.y)
    } 
}

class Fraccion(
    val numerador: Int,
    val denominador: Int
){
    def +(otra: Fraccion): Fraccion = {
        val denominador = this.denominador * otra.denominador
        val numerador = (this.numerador*otra.denominador + otra.numerador*this.denominador)
        Fraccion(numerador,denominador)
    }

    def -(otra: Fraccion): Fraccion = {
        val denominador = this.denominador * otra.denominador
        val numerador = (this.numerador*otra.denominador - otra.numerador*this.denominador)
        Fraccion(numerador,denominador)
    }
}

object Fraccion {
    def apply(numerador: Int, denominador: Int): Fraccion = {
        if denominador != 0 then new Fraccion(numerador,denominador)
        else new Fraccion(0,1)
    }
}


object Clase19 {

    def main(args: Array[String]) = {
        println(Configuracion.obtenerNombreCompleto())
        val producto = Product("Pringles",-30)
        println(producto.calcularPrecioConImpuesto())
        println(Calculadora(2,9)+Calculadora.resta(8,5))

        val v = new Vector(4,1)
        val w = new Vector(5,9)
        val t = v + w + v
        println(s"x = ${t.x}, y = ${t.y}")
        val s = v productoRaro w
        println(s"x = ${s.x}, y = ${s.y}")

        val frac1 = Fraccion(3,5)
        val frac2 = Fraccion(2,7)
        val suma = frac1 + frac2
        val resta = frac1 - frac2
        println(s"${suma.numerador} / ${suma.denominador}")
        println(s"${resta.numerador} / ${resta.denominador}")
    }
}