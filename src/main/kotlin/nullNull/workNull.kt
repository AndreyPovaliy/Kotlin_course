package nullNull

fun main() {

//    превый пример
    val inputChildrenCount: Int? = null

    /*    val childrenCount = if (inputChildrenCount == null)
            0
        else
            inputChildrenCount*/

    val childrenCount = inputChildrenCount ?: 0
    println(childrenCount)

//    второй пример
    val rectangle: Rectangle? = null
//    преверка есть ли такой объект
    rectangle?.printArea()
//    выполнит в обход компилятора
    rectangle!!.printArea()
}

class Rectangle(
    private val a: Int,
    private val b: Int
) {
    fun printArea() {
        val result = a + b
        println(result)
    }
}