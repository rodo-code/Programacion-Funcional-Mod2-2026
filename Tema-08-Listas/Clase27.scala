object Clase27 {

    def imprimirLista(lista: List[Int]): Unit = {
        lista match
            case Nil => print("\n")
            case cabeza :: cola => {
                print(s"$cabeza ")
                imprimirLista(cola) // Paso recursivo
            }
    }

    def suma(lista: List[Int]): Int = {
        lista match
            case Nil => 0
            case cabeza :: cola => cabeza + suma(cola)  
    }

    //Implemente funciones que permitan:
    // 1 Generar un string con los elementos de una lista de Int
    def generarString(lista: List[Int]): String = {
        lista match
            case Nil => ""
            case cabeza :: cola => s"$cabeza ${generarString(cola)}"
        
    }
    // 2 Encontrar el menor elemento de una lista de Int
    def minimo(lista: List[Int]): Int = {
        lista match
            case Nil => Int.MaxValue
            case cabeza :: Nil => cabeza
            case cabeza :: cola => {
                val minimoCola = minimo(cola)
                if cabeza < minimoCola then cabeza else minimoCola
            } 
    }

    def duplicar(lista: List[Int]): List[Int] = {
        lista match
            case Nil => Nil
            case cabeza :: cola => (cabeza * 2) :: duplicar(cola)
    }

    def soloPares(lista: List[Int]): List[Int] = {
        lista match
            case Nil => Nil
            case cabeza :: cola => {
                if cabeza % 2 == 0 then cabeza :: soloPares(cola)
                else soloPares(cola)
            }        
    }

    def main(args: Array[String]) = {
        val listaSimple = 10 :: 9 :: 7 :: 6 :: Nil
        val lista: List[Int] = List(1, 2, 5, 6)
        val listaNueva = 0 :: lista
        println(lista(2))
        println(lista)
        println(listaNueva)
        println(listaSimple)
        println(listaSimple.head)
        println(listaSimple.tail)
        imprimirLista(listaNueva)
        println(suma(lista))
        println(generarString(listaNueva))
        println(minimo(listaSimple))
        println(duplicar(listaNueva))
        println(soloPares(listaNueva))

        val aprobados = List("Quelali","Alejo","K Miranda","Pochi")
        println(aprobados.contains("Pochi"))
        println(aprobados.length)
        println(Nil.isEmpty)
    }
}