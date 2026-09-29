object Clase7 {

    def contarDigitos(num: Int): Int = {
        if num<10 && num>=0 then 1
        else 1 + contarDigitos(num/10)
    }

    def contarDigitosV2(num: Int): Int = {
        if num>0 then 1 + contarDigitosV2(num/10)
        else 0
    }

    def sumaDigitos(num: Int): Int = {
        if num == 0 then 0
        else {
            val digito = num%10
            digito + sumaDigitos(num/10)
        }
    }

    def mayorDigito(num: Int): Int = {
        // Existen funciones internas que solo viven en el bloque de codigo
        // de su funcion anfitriona
        def maximo(a: Int, b: Int): Int = {
            if a > b then a else b
        }
        if num<10 && num>=0 then num
        else maximo(num%10,mayorDigito(num/10))
    }

    def mayorDigitoV2(num: Int): Int = {
        if num<10 && num>=0 then num
        else {
            val mayorDigitoResto = mayorDigitoV2(num/10)
            val digito = num % 10
            if digito > mayorDigitoResto then digito else mayorDigitoResto
        }
    }

    def main(args: Array[String]): Unit = {
        println(contarDigitos(123))
        println(contarDigitosV2(78494))
        println(sumaDigitos(2393))
        println(mayorDigito(11117111))
    }
}