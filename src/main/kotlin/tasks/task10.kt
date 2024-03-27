

/*Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)

Написать функцию, которая принимает на вход список объектов
класса User  и возвращает самого младшего из них*/

fun main(){
    val employee1 = Employee("Kirill", 23)
    val employee2 = Employee("Olga", 28)
    val employee3 = Employee("Ivan", 29)
    val employee4 = Employee("Oleg", 35)

    val employees = listOf(employee1, employee2, employee3, employee4)
    val youngerOfList =youngerEmployee(employees)
    println(youngerOfList)
}
data class Employee(val name: String, val age: Int)

fun youngerEmployee (employees: List<Employee>):Employee{
    var youngerEmployee = employees[0]

    for (employee in employees) {
         if (employee.age < youngerEmployee.age)
             youngerEmployee = employee

    }

    return (youngerEmployee)

}