package dataClasses

fun main(){
    val user1 = User ("Kirill", 23)
    val user2 = User ("Olga", 35)

    val maxAgeUser: User = gerMaxAgeUser(user1,user2)
    println(maxAgeUser)
}

fun gerMaxAgeUser (user1: User, user2: User):User{
    val maxAgeUser = if (user1.age > user2.age)
        user1
    else
        user2
    return (maxAgeUser)

}


data class User(val name:String, val age:Int)