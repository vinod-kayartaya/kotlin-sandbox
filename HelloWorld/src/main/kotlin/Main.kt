fun main(){
    println("Enter a number: ")
    var input = readln()
    var num = input.toInt()
    var fact = factorial(num)
    println()
}

fun factorial(n:Int): Long {
    return if (n==0 || n==1){
        1
    } else {
        var result: Long = 1
        for (i in 2..n){
            result *= i
        }
        result
    }
}