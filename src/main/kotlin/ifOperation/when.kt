package ifOperation

fun main(){
    val rating = 3

    when (rating){
        1,2 -> println("плохо")
        3 -> println("удовлетворительно")
        4 -> println("хорошо")
        5 -> println("отлично")
    }


    when {
        rating== 1 || rating==2 -> println("плохо")
        rating== 3 -> println("удовлетворительно")
        rating== 4 -> println("хорошо")
        rating== 5 -> println("отлично")
    }
}