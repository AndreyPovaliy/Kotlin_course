package tasks1

/*
Написать функцию, которая для двух целых чисел возвращает
«первое число больше» если первое больше,
«второе число больше» если второе больше и «числа равны», если они равны*/


fun main() {
    val number1: Int = readln().toInt()
    val number2: Int = readln().toInt()

    val maxNumber: String = getStringMaxNumber(number1, number2)
    println(maxNumber)

}

fun getStringMaxNumber(n1: Int, n2: Int): String {
    return  if (n1 > n2)
        "первое число больше"
    else if (n1 < n2)
        "второе число больше"
    else
        "числа равны"




}