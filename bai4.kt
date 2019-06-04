import java.util.Scanner

fun phanTich(n: Int) {
        var n = n
        var i = 2
        while (n > 0) {
            if (n % i == 0) {
                if (n == i) {
                    print(i)
                    break
                } else
                    print("$i*")
                n /= i
            } else
                i++
        }
    }

    internal fun tong(n: Int): Int {
        var n = n
        var tg = 0
        while (n > 0) {
            tg += n % 10
            n /= 10
        }
        return tg
    }

    fun main(args:Array<String>) {
        println("Số nguyên là: ")
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        print("phan tich n thanh cac thua so nguyen to: ")
        phanTich(n)
        println("")
    }
