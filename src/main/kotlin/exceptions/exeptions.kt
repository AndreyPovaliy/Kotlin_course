package exceptions

fun main() {
    val aString = "10"
    val b = 0

    try {
        val a = aString.toInt()
        val result = a / b

        println(result)
    }catch(e: Exception){
        println(e.toString())
    } catch (e: NumberFormatException){
        println(e.toString())
    }

}