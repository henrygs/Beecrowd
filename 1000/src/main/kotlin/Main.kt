import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

    // Tem essa forma de fazer, mas a plataforma não permite
    val scan = Scanner(System.`in`)

    val raio = scan.nextLine().trim().toDouble()
    // usando a expressão/função pow
    val exp = raio.pow(2)
    val pi = 3.14159
    val area = pi * exp

    println("A=%.4f".format(area))
}


