package introductionOop

fun main(){
    val employee1 = Employee("Kirill", 10000)
    val employee2 = Employee("Olga", 10000)

    employee1.addProject("Project 1")
    employee1.addProject("Project 2")
    employee1.addProject("Project 3")


    employee2.addProject("Project 1")

    employee1.printAllProjects()
}

class Employee(val name:String, val salary: Int){
    private val projects: MutableList<String> = mutableListOf<String>()

    fun addProject(projectName: String){
        projects.add(projectName)
        println("Сторудник ${name}: начад работу над проектом $projectName")
    }

    fun printAllProjects(){
        for(project in projects)
            println(project)
    }

}