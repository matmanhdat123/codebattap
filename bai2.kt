fun main(args: Array<String>) {
    var a:Int=9
    var b:Int=6
    var ucscln=1
    var min=if (a>b) b else a
    for (i in min downTo 1)
    {
        if(a%i==0 && b%i==0)
        {
            ucscln=i
            break
        }
    }
    println("USCL của $a và $b = $ucscln")
}