package tasks2

import java.lang.Exception

/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions. (с зп 170000)*/
fun main() {
    val someEmployee = SomeEmployee1("Kirill", 128000, 18)
    val someEmployee2 = SomeEmployee1("Oleg", 150000, 21)
    val someEmployee3 = SomeEmployee1("Olga", 270000, 25)

    val employees: List<SomeEmployee1> = listOf(someEmployee, someEmployee2, someEmployee3)

    try {
        val equalSalary = findEmployeeBySalary1(employees, 170000)
        println(equalSalary)
    }catch (e: Exception){
        println(e.message)
    }



}


class SomeEmployee1(
    val name: String,
    val salary: Int,
    val age: Int
) {
    fun callToClient(clientName: String) {
        println("Сотрудник $name: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary1(employees: List<SomeEmployee1>, salary: Int): SomeEmployee1 {

    for (employee in employees) {
        if (employee.salary == salary)
            return employee


    }
    throw Exception("Сотрудник с зарплатой $salary не найден")
}