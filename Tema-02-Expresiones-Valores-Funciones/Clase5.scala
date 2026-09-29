object Clase5 {

    var tipoCambio: Double = 12.06

    def actualizarTipoCambio(nuevoTipoCambio: Double): Unit = {
        tipoCambio = nuevoTipoCambio
    }
    // No puro
    def convertirDolaresBolivianos(montoDolares: Double): Double = {
        montoDolares*tipoCambio
    }

    // Puro
    def convertirDolaresBolivianos(montoDolares: Double, tipoCambio: Double): Double = {
        montoDolares*tipoCambio
    }

    /* EJEMPLOS DE EFECTOS SECUNDARIOS
        * Mostrar información en pantalla.
        * Leer información del teclado.
        * Leer o escribir archivos.
        * Modificar una base de datos.
        * Enviar información por internet.
        * Modificar variables externas.
        * Generar números aleatorios.
        * Obtener la fecha y hora actuales.
    */

    def main(args: Array[String]): Unit = {
        println(convertirDolaresBolivianos(100,12.06))
        actualizarTipoCambio(12.10) // No afecto a la funcion pura convertirDolaresBolivianos con dos parametros es pura
        println(convertirDolaresBolivianos(100,12.06))
        // convertirDolaresBolivianos con un parametro no es pura
        // la razon de fondo es que usamos una variable externa
    }

}