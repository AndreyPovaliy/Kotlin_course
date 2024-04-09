import lambda.User
import lambda.filterByCondition

/*
* Написать функцию преобразования каждого элемента коллекции пользователей
* в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

Sample Input:
Kirill, 45
Olga, 32
Marina, 12
*
Sample Output:
[Name: Kirill. Age: 45, Name: Olga. Age: 32, Name: Marina. Age: 12]*/


fun main() {
//    ввести данные
    val user1 = User("Kirill", 45)
    val user2 = User("Olga", 32)
    val user3 = User("Marina", 12)


    //    объединить данные в коллекцию
    val users = listOf(user1, user2, user3)

    val stringUsers = convertToStrings(users) { "Name: ${it.name}. Age: ${it.age}"}

    println(stringUsers)

    //    применение функции
}

fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>{
    val stringUsers = mutableListOf<String>()
    for (user in users)
        stringUsers.add(conversion(user))
    return stringUsers
}