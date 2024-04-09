package interfaces


fun main() {
    val robot1 = Robot(1)
    robot1.callToClient("Kirill")

    val manager1 = Manager("Olga",1234)
    manager1.callToClient("Kirill")

    val clientWorkers = listOf<ClientWorker>(robot1,manager1)

    for(clientWorker in clientWorkers)
        clientWorker.callToClient("Kirill")
}

interface ClientWorker{
    fun callToClient(clientName:String)
}
abstract class Employee(
    val name: String,
    val salary: Int
) {

    protected val projects: MutableList<String> = mutableListOf()
    abstract fun addProject(projectName: String)

    fun printAllProjects(){
        println("Проекты сотрудника ${name}: ${projects.joinToString()}")
    }

}

class Programmer(name: String, salary: Int):Employee(name,salary){
    override fun addProject(projectName: String){
        projects.add(projectName)
        println("Программист ${name}: начал работу над проектом $projectName")
    }

    fun readArticle(articleName:String){
        println("Прогаммист ${name}: читает статью $articleName")
    }
}


class Manager(name: String, salary: Int):Employee(name,salary),ClientWorker{

    override fun addProject(projectName: String){
        projects.add(projectName)
        println("Менеджер ${name}: начал работу над проектом $projectName")
    }
    override fun callToClient(clientName:String){
        println("Манеджер ${name}: звонит $clientName")
    }
}

class Robot (val id:Int) : ClientWorker {
    override fun callToClient(clientName:String){

        println("Робот ${id}: звонит $clientName")
    }
}