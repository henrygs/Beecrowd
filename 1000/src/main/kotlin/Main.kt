import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.*

fun main(args: Array<String>) {
    
    val scan = Scanner(System.`in`)

    val a = scan.nextLine().trim().toDouble()
    val pi = 3.14159
    val area = pi * (a*a)

    println("A=%.4f".format(area))
}