import java.util.Scanner


    private val scanner = Scanner(System.`in`)


    fun main(args: Array<String>) {
        print("Nhập n = ")
        val n = scanner.nextInt()
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n)
        var dem = 0
        var i = 2
        while (dem < n) {
            if (isPrimeNumber(i)) {
                print("$i ")
                dem++
            }
            i++
        }
    }


    fun isPrimeNumber(n: Int): Boolean {
        if (n < 2) {
            return false
        }
        val squareRoot = Math.sqrt(n.toDouble()).toInt()
        for (i in 2..squareRoot) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }

