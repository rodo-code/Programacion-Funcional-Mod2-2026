class Persona(
    val nombre: String,
    val edad: Int, // Si no ponemos ni val ni var, el atributo es privado
    val ocupacion: String
) {
    def presentacion(): String = {
        s"Hola soy $nombre tengo $edad años y soy un $ocupacion"
    }
    def esMayorQue(otra: Persona): Boolean = {
        edad > otra.edad
    }
    def incrementarEdad(): Persona = {
        new Persona(nombre,edad+1,ocupacion)
    }
}

class Producto(
    val nombre: String,
    val precio: Double
) {
    def precioConDescuento(porcentajeDescuento: Double): Double = {
        precio - (precio * porcentajeDescuento)
    }
}

object Main {
    def main(args: Array[String]) = {
        val persona1 = new Persona("Omar Tapuna", 20, "Sucheado")
        val persona2 = new Persona("Pochi",4,"Sucha Profesional")
        println(persona2.edad)
        println(persona1.esMayorQue(persona2))
        val persona3 = persona2.incrementarEdad()
        println(persona3.edad)
        println(persona1.presentacion())
        println(persona2.presentacion())

        val producto = new Producto("Papas Fritas",12)
        println(producto.precioConDescuento(0.1))
    }
}
