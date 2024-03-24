package tasks

/*Вывести на экран большее из двух целых чисел*/

fun main(){
    val number1: Int = readln().toInt()
    val number2: Int = readln().toInt()

    if (number1 > number2)
        println(number1)
    else
        println(number2)

}

