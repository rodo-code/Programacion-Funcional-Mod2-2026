abstract class Animal(
  val nombre: String
) {
  def sonido(): String = s"$nombre esta emitiendo un sonido"
}

class Ornitorrinco(
    nombre: String
) extends Animal(nombre)

class Ñandu(
    nombre: String
) extends Animal(nombre)

class Refugio[A <: Animal](
    val animal: A
) {
    def escucharSonido(): String = animal.sonido()
}

class Pruebita[A >: Ornitorrinco](
    val valor: A
) {
    def imprimir() = println(valor)
}

object Clase24 {


    def main(args: Array[String]) = {
        val ornitorrinco1 = new Ornitorrinco("Perry")
        val ñandu1 = new Ñandu("Erick")
        val refugio1 = new Refugio(ornitorrinco1)
        val refugio2 = new Refugio(ñandu1)
        println(refugio1.escucharSonido())
        val prueba1 = new Pruebita(12)
        prueba1.imprimir()
        
    }
}