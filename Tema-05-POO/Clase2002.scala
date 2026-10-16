trait Acuatico {
    def nadar(): String
}

trait Terreste {
    def andar(): String
}

trait Volador {
    def volar(): String
}

class Tortuga(
    val nombre: String
) extends Acuatico with Terreste{
    def nadar(): String = "Soy una tortuga nadadora"
    def andar(): String = "Soy una tortuga y ando lento"
}

class Pato(
    val nombre: String
) extends Acuatico with Volador {
    def nadar(): String = "Que hace el pato? Nada"
    def volar(): String = s"$nombre esta volando"
}

object Clase2002 {

    def main(args: Array[String]): Unit = {

    }
}