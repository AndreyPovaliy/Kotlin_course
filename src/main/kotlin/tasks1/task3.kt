package tasks1

/*1. Проверить email на корректность ввода. Если email некорректен,
то вывести об этом сообщение.
Обратите внимание, что в случае корректного email вообще ничего выводить не надо.

Корректным считается email если в нем присутствует символа @ и точка.
Проверить наличие символа в строке можно
с помощью функции contains следующим образом:
string.contains(‘@’), где string – любая переменная типа String.
Обратите внимание, что отдельные символы пишутся в одинарных кавычках,
тогда как строка пишется в двойных.*/

fun main(){
    val email:String = readln().toString()

    if(!email.contains("@") && !email.contains("."))
        println("e-mail некорректен")

}