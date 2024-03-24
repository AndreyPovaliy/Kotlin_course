package ifOperation

fun main() {
    val userAge: Int = 21

    val document = if (userAge > 14)
        "паспорт"
    else
        "свидетельство о рождении"

    println(document)
}