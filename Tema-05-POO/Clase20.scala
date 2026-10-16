trait Saludable {
    def saludo(): String = "Hola"
    def saludoFormal(): String 
}

class Person(
    val nombre: String,
    val edad: Int
) extends Saludable {
    override def saludo(): String = s"Hola $nombre"
    def saludoFormal(): String = s"Buenos dias $nombre"
}

class Mascota(
    val nombre: String
) extends Saludable {
    def saludoFormal(): String = s"Pspsps $nombre"
}

trait Figura {
    // val nombre: String se pueden poner valores a un trait
    def area(): Double
    def descripcion(): String = s"Area = ${area()}"
}

class Rectangulo(
    val base: Double,
    val altura: Double
) extends Figura {
    def area(): Double = base * altura
}

class Circunferencia(
    val radio: Double
) extends Figura {
    def area(): Double = Math.PI * radio * radio
    override def descripcion(): String = s"Soy una circunferencia y mi area es ${area()}"
}

object Clase20 {

    def main(args: Array[String]): Unit = {
        val persona1 = new Person("Dani Ponce", 21)
        println(persona1.saludo())
        println(persona1.saludoFormal())
        val conejito = new Mascota("Moka")
        println(conejito.saludoFormal())

        val figura1 = new Rectangulo(4,7)
        println(figura1.descripcion())
        val figura2 = new Circunferencia(5)
        println(figura2.descripcion())
    }
}