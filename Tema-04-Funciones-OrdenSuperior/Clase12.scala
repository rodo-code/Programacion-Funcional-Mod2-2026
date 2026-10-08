object Clase12 {

    def mayor(a: Int, b: Int): Int = {
        if a > b then a else b
    }

    def main(args: Array[String]): Unit = {
        // Puedo guardar una funcion en un valor
        val maximo: (Int, Int) => Int  = mayor
        println(maximo(6,9))
        // Puedo crear funciones directamente como valor
        val doble = (numero: Int) => numero * 2 // Con inferencia de tipo
        println(doble(6))
        val triple: Int => Int = numero => numero * 3
    }
}