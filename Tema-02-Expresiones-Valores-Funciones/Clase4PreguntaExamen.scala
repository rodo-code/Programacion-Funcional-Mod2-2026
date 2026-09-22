object Clase4PreguntaExamen {
    
    def funcionA(y: Int): Int = { 
        println("funcionA") 
        x+1 
    } 
    def funcionB(z: Int): Int = { 
        val x: Int = z + z 
        val y: Int = x * z 
        y 
    } 
    val x: Int = 3 

    def main(args: Array[String]): Unit = {
        val res: Int = funcionB(funcionA(3)) 
        println(res) 
    }
}