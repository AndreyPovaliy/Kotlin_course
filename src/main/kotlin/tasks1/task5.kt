package tasks1

/*Те же требования каршеринга. На вход подаются: марка авто(String),
возраст и стаж пользователя. Определить доступно ли ему это авто или нет.*/


fun main() {
    println("Как вас зовут?")
    val userName: String = readln()
    println("$userName, сколько Вам лет?")
    val userAge: Int = readln().toInt()
    println("$userName, сколько Ваш стаж вождения?")
    val userExperience: Int = readln().toInt()
    println("$userName, какую машину вы хотите?")
    val carModel: String = readln()

    if (userAge >= 26 && userExperience >= 6)
        println("$userName, вам доступен $carModel")
    else if (userAge >= 21 && userExperience >= 2 && !(carModel == "Audi" || carModel == "BMW"))
        println("$userName, вам доступен $carModel")
    else
        println("$userName, вам не доступен $carModel")


}