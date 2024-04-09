/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент,
который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean (10)

Sample Input:
Kirill, 45
Olga, 32
Marina, 12

Sample Output:
false
*/


fun main() {
//    ввести данные
    val user1 = User1("Kirill", 45)
    val user2 = User1("Olga", 32)
    val user3 = User1("Marina", 12)


    //    объединить данные в коллекцию
    val users1 = listOf(user1, user2, user3)

    val isUsers:Boolean = containsElement(users1){ it.age == 10}

    println(isUsers)

    //    применение функции
}

data class User1(val name: String, val age: Int)
fun containsElement(users: List<User1>, condition: (User1) -> Boolean): Boolean{
    var isElement: Boolean = false
    for (user in users)

        if (condition(user))
            isElement = true
    return isElement

}