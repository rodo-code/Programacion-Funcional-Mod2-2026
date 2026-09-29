object Clase5PasoPorNombre {

    def multiplicar(a: => Int, b: Int) = {
        println(s"El valor de a es $a")
        println(s"El valor de b es $b")
        a + b
        a * b
    }

    def obtenerNumero1(): Int = {
        println("Obteniendo a")
        9
    }

    def obtenerNumero2(): Int = {
        println("Obteniendo b")
        10
    }

    def main(args: Array[String]): Unit = {
        val num1: Int = 9
        val num2: Int = 10
        // Tambien se puede enviar a 9 y 10 de las siguientes formas
        //multiplicar(9,10)
        //multiplicar(num1,num2)
        println(multiplicar(obtenerNumero1(),obtenerNumero2()))
    }
}