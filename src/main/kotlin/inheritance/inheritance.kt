package inheritance

fun main() {
    val programmer1 = Programmer("Kirill",2323425)
    programmer1.addProject("Project 1")
    programmer1.addProject("Project 2")
    val programmer2 = Programmer("Jane",2323425)
    programmer2.addProject("Project 3")
    val manager1 = Manager ("Olga", 23434)
    manager1.addProject("Project 4")

    val employees = listOf<Employee>(programmer1,programmer2,manager1)

    for(employee in employees)
        employee.addProject("Common project")

    for(employee in employees)
        employee.printAllProjects()

}

open class Employee(
    val name: String,
    val salary: Int
    ) {

    private val projects: MutableList<String> = mutableListOf()
    fun addProject(projectName: String){
        projects.add(projectName)
        println("Сотрудник ${name}: начал работу над проектом $projectName")
    }

    fun printAllProjects(){
        println("Проекты сотрудника ${name}: ${projects.joinToString()}")
    }

}

class Programmer(name: String, salary: Int):Employee(name,salary){
    fun readArticle(articleName:String){
        println("Прогаммист ${name}: читает статью $articleName")
    }
}


class Manager(name: String, salary: Int):Employee(name,salary){
    fun callToClient(clientName:String){
        println("Манеджер ${name}: звонит $clientName")
    }
}