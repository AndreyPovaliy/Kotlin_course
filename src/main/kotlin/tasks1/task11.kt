/*
Дан класс, описывающий пользователя:

Data class User(val name: String, val age: Int)

1. Для классов User и Car из задач по дата-классам написать функцию,
которая принимает на вход список автомобилей и пользователя и выдает
список только тех автомобилей из исходного списка, которые доступны
данному пользователю.
 */

fun main() {
    val userRich = User("Rich", 22, 4)
    val userAlex = User("Alex", 32, 12)
    val userNike = User("Nike", 17, 0)
    val userNataly = User("Nataly", 27, 4)

    val carBMW = Car("BMW", 12.0)
    val carAudi = Car("Audi", 11.5)
    val carNissan = Car("Nissan", 7.4)
    val carRenault = Car("Renault", 5.9)
    val carKia = Car("Kia", 7.2)

    val users = listOf<User>(userRich, userAlex, userNike, userNataly)
    val cars = listOf<Car>(carBMW, carAudi, carNissan, carRenault, carKia)

    for (user in users) {
        val availableCars = availableCars(user, cars)
        println(availableCars)
    }


}

data class User(val name: String, val age: Int, val experience: Int)
data class Car(val model: String, val price: Double)

fun availableCars(user: User, cars: List<Car>): List<Car> {
    val availableCars = mutableListOf<Car>()
    if (user.age >= 26 && user.experience >= 6) {
        for (car in cars)
            availableCars.add(car)
    } else if (user.age >= 21 && user.experience >= 2) {
        for (car in cars)
            if (!(car.model == "Audi" || car.model == "BMW"))
                availableCars.add(car)
    }
    return (availableCars)
}