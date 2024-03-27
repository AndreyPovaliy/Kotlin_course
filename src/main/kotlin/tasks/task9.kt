package tasks

/*Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)

Написать функцию, которая принимает на вход список объектов
класса User  и возвращает средний возраст всех пользователей.*/

fun main(){
    val employee1 = Employee("Kirill", 23)
    val employee2 = Employee("Olga", 28)
    val employee3 = Employee("Ivan", 29)
    val employee4 = Employee("Oleg", 35)

    val employees = listOf(employee1, employee2, employee3, employee4)
    val meanOfList =mean(employees)
    println(meanOfList)
}
data class Employee(val name: String, val age: Int)

fun mean(employees: List<Employee>):Int{
    var sum = 0
    var counter = 0
    for (employee in employees) {
        sum += employee.age
        counter +=1
    }
    val mean =  sum/ counter
    return (mean)

}