/*Дана такая структура классов:

Компания: data class Company(val name: String, val departments: List<Department>)

Отдел: data class Department(val name: String, val employees: List<Employee>)

Сотрудник: data class Employee(val name: String, val age: Int)

Написать функции для подсчета общего количества человек, работающих в заданной компании и их среднего возраста

fun totalNumberOfEmployees(company: Company): Int

fun averageAgeOfEmployees(company: Company): Int*/
