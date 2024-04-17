package tasks2
/*Есть класс:
class SomeEmployee(
    val name: String,
    val salary: Int
) {
    fun callToClient(clientName: String) {
        println("Сотрудник name: звоню клиенту clientName")
    }
}

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)*/


fun main() {
    val someEmployee = SomeEmployee("Kirill", 200, 18)
    val someEmployee2 = SomeEmployee("Oleg", 200, 21)
    val someEmployee3 = SomeEmployee("Olga", 1000, 25)

    val employees: List<SomeEmployee> = listOf(someEmployee, someEmployee2, someEmployee3)
    val equalSalary = findEmployeeBySalary(employees, 300)
    println(equalSalary?.name)
    someEmployee2?.callToClient("Ivan")
}

class SomeEmployee(
    val name: String,
    val salary: Int,
    val age: Int
) {
    fun callToClient(clientName: String) {
        println("Сотрудник $name: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee? {
    var someEmployee: SomeEmployee? = null
    for (employee in employees)
        if (employee.salary == salary){
            someEmployee = employee
            break
        }
    return someEmployee
}