import java.util.*

fun main(args: Array<String>) {
    nhap()
}

internal fun nhap() {
    val n: Int
    val b: Int
    val sc = Scanner(System.`in`)
    print("Input n và base system b: ")
    // 0 < b ≤ 36
    n = sc.nextInt()
    b = sc.nextInt()
    val str = chuyen(n, b)
    print("$n Switching from System 10 to base $b: ")
    xuat(str)
}

internal fun xuat(str: String) {
    for (i in 0 until str.length)
        print(str[str.length - i - 1])
    println("")
}

internal fun chuyen(n: Int, b: Int): String {
    var n = n
    var str = ""
    var x = 0
    while (n > 0) {
        x = n % b
        n /= b
        if (b == 16) {
            if (x == 10) str += "A"
            if (x == 11) str += "B"
            if (x == 12) str += "C"
            if (x == 13) str += "D"
            if (x == 14) str += "E"
            if (x == 15) str += "F"
            if (0 <= x && x < 10) str += x
        } else
            str += x
    }
    return str
}