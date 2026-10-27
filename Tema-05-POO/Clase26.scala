sealed trait EstadoPedido

case object Pendiente extends EstadoPedido

case class Enviado(
    val encargadoEntrega: String
) extends EstadoPedido 

case class Entregado(
    val horaEntrega: Int,
    val minutoEntrega: Int
) extends EstadoPedido

case class Pedido(
  id: Int,
  estado: EstadoPedido
)

def describirEstado(estado: EstadoPedido): String = {
    estado match
        case Pendiente => "Estado del Pedido Pendiente"
        case Enviado(encargadoEntrega) => s"Pedido enviado y sera entregado por $encargadoEntrega"
        case Entregado(horaEntrega, minutoEntrega) => s"Pedido entregado a las $horaEntrega:$minutoEntrega"
}

def describirPedido(pedido: Pedido): String = {
    pedido match
        case Pedido(id,Pendiente) => s"El pedido con ID: $id esta pendiente"
        case Pedido(id,Enviado(encargadoEntrega)) => s"El pedido con ID: $id sera entregado por $encargadoEntrega"
        case Pedido(id,Entregado(horaEntrega, minutoEntrega)) => s"El pedido con ID: $id fue entregado"
        case _ => "Pedido invalido"
}

case class Nodo(
    valor: Int,
    izquierda: Nodo,
    derecha: Nodo
) 

object Clase26 {

    def main(args: Array[String]) = {
        println(describirEstado(Pendiente))
        println(describirEstado(Enviado("Abdul")))
        println(describirEstado(Entregado(22,15)))
        val pedido = Pedido(1,Pendiente)
        val pedido2 = Pedido(2,Enviado("Abdul"))
        val pedido3 = Pedido(3,Entregado(17,23))
        println(describirPedido(pedido3))

        val arbol = Nodo(1,Nodo(2,null,null),Nodo(3,null,null))
    }
}