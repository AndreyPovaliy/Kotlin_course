package tasks2

/*Есть классы:

class Address(val address: String, val city: String)

class Company(val name: String, val address: Address?)

class Employee(val name: String, val company: Company?)



Напишите функцию fun employeeCity(employee: Employee): String, которая возвращает название города,

в которой располагается организация, в которой работает данный человек.

В случае если он нигде не работает (в company лежит null), функция должна выводить: «Неизвестен»

Используйте функции безопасного вызова и оператор элвис*/


fun main() {

}

class Address(val address: String, val city: String)

class Company(val name: String, val address: Address?)

class Employee(val name: String, val company: Company?)

fun employeeCity(employee: Employee): String {
    return employee.company?.address?.city ?: "Неизвестен"
}