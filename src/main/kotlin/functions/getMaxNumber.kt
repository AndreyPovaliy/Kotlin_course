package functions

fun main(){
    val number1: Int = readln().toInt()
    val number2: Int = readln().toInt()

    val maxNumber: Int = getMaxNumber(number1,number2)
    println(maxNumber)

}

fun getMaxNumber(n1: Int, n2: Int): Int {
    return if (n1 > n2)
        n1
    else
        n2

}
