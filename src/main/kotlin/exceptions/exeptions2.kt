package exceptions

fun main() {
    val login = "Roman"
    val password = "gesr34"
    val confirmPassword = "gesr34"

    try {
        signIn(login, password, confirmPassword)
    } catch (e: Exception){
        println(e.message)
    }
}

fun signIn(login: String, password: String, confirmPassword: String){
    if(login.length>20)
        throw  Exception ("Логин слишком длинный")

    if(password.length<10)
        throw  Exception ("Пароль слишком короткий")

    if(password != confirmPassword)
        throw  Exception ("Пароль и подтверждение не совпадают")
}