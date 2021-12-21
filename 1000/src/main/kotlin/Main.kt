import java.text.DecimalFormat
import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

    // Tem essa forma de fazer, mas a plataforma não permite
    val scan = Scanner(System.`in`)

    val raio = scan.nextLine().trim().toDouble()
    val df = DecimalFormat("00000.0000")
    val pi = 3.14159
    val area = pi * (raio * raio)

    println("A=${df.format(area)}")
}


