case class Ropa(
    tipo: String,
    talla: String,
    precio: Double
)

object Clase25 {

    def describirRopa(ropa: Ropa): String = {
        ropa match
            case Ropa("Jean","42",precio) if precio < 200 => s"Encontrado"
            case Ropa(tipo, talla, precio) => {
                s"Tipo: $tipo \nTalla: $talla\nPrecio: $precio"
            }
        
    }

    def describir(numero: Int): String =
    numero match
        case 0 => "Cero"
        case 1 => "Uno"
        case 2 => "Dos"
        case n => "Aqui entran todos los casos"
        case _ => "Otro número"


    def main(args: Array[String]) = {
        val ropa1 = Ropa("Jean","42",200)
        val ropa2 = Ropa("Canguro","L",300)
        val ropa3 = ropa1.copy(precio=250)
        println(ropa1.tipo)
        println(ropa3.precio)
        println(ropa3)
        println(describirRopa(ropa2))
    }
}