

import kotlin.math.PI
import kotlin.math.round



/*
Для созданных в предыдущих задачах классов Rectangle и Round пропишите суперкласс Figure,
в котором будет поле цвет типа String, которое должно инициализироваться через конструктор
и два поля x и y типа Int, которые будут задавать положение фигуры в пространстве
относительно начала координат
и инициализироваться в теле класса начальными значениями ноль.

Пропишите в этом классе функции moveLeft(step: Int), moveRight(step: Int), moveDown(step: Int), moveUp(step: Int),
которые будут сдвигать фигуру, то есть менять ее координаты x и y

Сделайте Rectangle и Round наследниками класса Figure
*/

fun main() {

    val rectangle1 = Rectangle(4.5,1.2, "red")
    println(rectangle1.area())
    println(rectangle1.length())
    println(rectangle1.isSquare())
}

open class Figure (val color: String) {
    private var x:Int=0
    private var y:Int=0
    fun moveLeft(step: Int){
        x -= step


    }
   fun moveRight(step: Int){
       x += step

   }

    fun moveDown(step: Int){
        y -= step
    }
    fun moveUp(step: Int){
        y += step
    }
}
class Round (private val radius: Double, color: String):Figure(color){
    fun area(): Double {
        return PI * (radius * radius)
    }



    fun length(): Double {
        return 2 * (PI * radius)
    }

}
class Rectangle(private val width: Double, private val height: Double, color: String):Figure(color) {
    private var isSquare = false
    fun area(): Double {
        return (round(width * height*10))/10
    }

    fun length(): Double {
        return 2 * (width + height)
    }

    fun isSquare(): Boolean {
        if (width == height)
            isSquare = true
        return isSquare
    }

}