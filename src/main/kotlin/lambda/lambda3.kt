package lambda

fun main (){

    val change = {parameter:String -> parameter + parameter }

    val result = change("4")

    println(result)
}