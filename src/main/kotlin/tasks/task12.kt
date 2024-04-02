
/*
Даны классы

Отдел: data class Department(val name: String, val employees: List<Employee>)

Сотрудник: data class Employee(val name: String, val age: Int)

Написать функцию, которая на вход принимает объект класса Department
и возвращает средний возраст сотрудников этого отдела
 */


fun main(){
    val employee1 = Employee("Kirill", 23)
    val employee2 = Employee("Olga", 28)
    val employee3 = Employee("Ivan", 29)
    val employee4 = Employee("Oleg", 35)

    val employees = listOf(employee1, employee2, employee3, employee4)
    val youngerOfList =youngerEmployee(employees)
    println(youngerOfList)
}

data class Department(val name: String, val employees: List<Employee>)

