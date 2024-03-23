package lambda


fun main() {
    val user1 = User("Kirill", 23)
    val user2 = User("Olga", 17)
    val user3 = User("Ivan", 32)
    val user4 = User("Oleg", 21)

    val users = listOf(user1, user2, user3, user4)

    val filteredUsers = filterByCondition(users) { it.age > 18 }
    println(filteredUsers)
}

data class User(val name: String, val age: Int)

fun filterByCondition(users: List<User>, condition: (User) -> Boolean): List<User> {
    val filteredUsers = mutableListOf<User>()
    for (user in users)
        if (condition(user))
            filteredUsers.add(user)
    return filteredUsers
}