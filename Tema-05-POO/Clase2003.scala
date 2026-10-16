abstract class Animal(
    val nombre: String,
    val peso: Double
) {
    def sonido(): String
}

class Perro(
    nombre: String,
    peso: Double,
    raza: String
) extends Animal(nombre,peso) {
    def sonido(): String = "Wuf Wuf"
}

class Gallina(
    nombre: String,
    peso: Double,
    color: String
) extends Animal(nombre,peso) {
    def sonido(): String = "Kokoroko"
}

object Clase2003 {

    def emitirSonido(animal: Animal): Unit = {
        println(animal.sonido())
    }

    def main(args: Array[String]): Unit = {
        val perro: Animal = new Perro("Loggy",11,"Cocker")
        emitirSonido(perro)
        val gallina: Animal = new Gallina("Claudio",5,"Blanco")
        emitirSonido(gallina)
    }
}