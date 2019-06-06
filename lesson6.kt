
import java.util.Scanner
fun main(args: Array<String>) {
    val n: Int
    var number = 1
    var f0 = 1
    var f1 = 1
    val input = Scanner(System.`in`)
    println("Input:")
    n = input.nextInt()
    if (n > 1) {
        for (i in 2..n) {
            number = f0 + f1
            f0 = f1
            f1 = number
        }
    }
    println("The $n th Fibonacci number is $number")
}
