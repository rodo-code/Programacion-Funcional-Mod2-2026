import scala.annotation.tailrec
object Clase9 {

    @tailrec
    def mcd(a: Int, b: Int): Int = {
        if b == 0 then a
        else mcd(b,a%b)
    }

    @tailrec
    def fibo(pos: Int, a: Long=0L, b: Long=1L): Long = {
        if pos == 0 then a
        else if pos == 1 then b
        else fibo(pos-1,b,a+b)
    }

    @tailrec
    def sumaCuadrados(num: Int, acum: Int = 0): Int = {
        if num==0 then acum
        else sumaCuadrados(num-1,(num*num)+acum)
    }

    @tailrec
    def productoDigitos(num: Int, acum: Int = 1): Int = {
        if num >= 0 && num<10 then num*acum
        else {
            val digito = num % 10
            val restante = num / 10
            productoDigitos(restante, digito * acum)
        }
    }

    @tailrec
    def invertirNumero(num: Int, acum: Int = 0): Int = {
        if num >= 0 && num <10 then acum*10 + num
        else invertirNumero(num/10,acum*10 + num%10)
    }

    def main(args: Array[String]): Unit = {
        println(invertirNumero(12300))
    }
}