package tasks1

fun main() {
    val user1 = User("Kirill", 28, 9)
    val car1 = Car("BMW", 15.3)
    val message = checkQuery(user1,car1)
    println(message)
}

data class User(val name: String, val age: Int, val experience: Int)
data class Car(val model: String, val price: Double)

fun checkQuery(user: User, car: Car): Boolean {
    return if (user.age >= 26 && user.experience >= 6){
        println("Доступны все авто")
        true
    }
    else if (user.age >= 21 && user.experience >= 2 && !(car.model == "Audi" || car.model == "BMW")){
        println("Вам доступен ${car.model}")
        false
    }

    else {
        println("Вам не доступены авто")
        false
    }


}