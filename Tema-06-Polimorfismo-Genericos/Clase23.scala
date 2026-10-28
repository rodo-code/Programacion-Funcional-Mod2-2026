abstract class Animal(
  val nombre: String
) {
  def sonido(): String = s"$nombre esta emitiendo un sonido"
}

class Perro(
    nombre: String
) extends Animal(nombre) {
    override def sonido(): String = "Guau"
}

class Gato(
   nombre: String
) extends Animal(nombre) {
    override def sonido(): String = "Miau"
}

def emitirSonido(animal: Animal): String = {
    s"${animal.nombre} esta emitiendo el sonido ${animal.sonido()}"
}

def imprimir(valor: Any): String = s"Imprimiendo $valor"

// Any no tiene todas las operaciones que tendria uno de sus subtipos como Int, String, Double
// def sumar(a: Any, b: Any): Any = a + b

def error(
  mensaje: String
): Nothing =
  throw new RuntimeException(mensaje)

object Clase23 {
    def main(args: Array[String]): Unit = {
        val perrito = new Perro("Loggy")
        println(emitirSonido(perrito))
        val gatito = new Gato("Gigi")
        println(emitirSonido(gatito))
        
        // Any acepta cualquier valor u objeto
        println(imprimir(5))
        println(imprimir("Josue Bernal"))
        // AnyVal acepta solo valores
        val val1: AnyVal = 7
        val val2: AnyVal = 98.2
        val val3: AnyVal = 'P'

        error("Quiero parar de funcionar")
    }
}