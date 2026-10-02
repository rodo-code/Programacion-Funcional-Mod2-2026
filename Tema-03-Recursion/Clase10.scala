import scala.annotation.tailrec
object Clase10 {

    @tailrec
    def contarGrupos(texto: String, pos: Int = 0, acum: Int = 0): Int = {
        if pos == texto.length()-1 then acum + 1
        else if texto.length() == 0 then 0
        else if texto(pos) == texto(pos+1) then contarGrupos(texto,pos+1,acum)
        else contarGrupos(texto,pos+1,acum+1)
    }

    @tailrec
    def multiplicarDigitos(num: Int, acum: Int = 1): Int = {
        if num < 10 then acum*num
        else multiplicarDigitos(num/10,acum*(num%10))
    }

    @tailrec
    def persistenciaMultiplicativa(num: Int, cont: Int = 0): Int = {
        if num < 10 then cont
        else persistenciaMultiplicativa(multiplicarDigitos(num),cont+1)
    }

    def main(args: Array[String]): Unit = {
        println(contarGrupos("aaabbcaa"))
        println(contarGrupos("aaaa"))
        println(contarGrupos("abcde"))
        println(contarGrupos("aabbcc"))
        println(contarGrupos(""))
        println(persistenciaMultiplicativa(7))
        println(persistenciaMultiplicativa(25))
        println(persistenciaMultiplicativa(39))
        println(persistenciaMultiplicativa(77))
        println(persistenciaMultiplicativa(999))
    }
}