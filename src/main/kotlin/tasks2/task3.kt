import kotlin.math.PI
import kotlin.math.round

/*
1. Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area
и length в него, оставив реализацию полиморфной для классов Rectangle и Round

2. Добавить еще один класс Triangle – тоже наследник Figure и прописать работу функций area() и length() для него*/


fun main() {

    val rectangle1 = Rectangle(4.5, 1.2, "red")
    println(rectangle1.area())
    println(rectangle1.length())
    println(rectangle1.isSquare())
}

abstract class Figure1(val color: String) {
    private var x: Int = 0
    private var y: Int = 0

    abstract fun area(): Double

    abstract fun length(): Double
    fun moveLeft(step: Int) {
        x -= step


    }

    fun moveRight(step: Int) {
        x += step

    }

    fun moveDown(step: Int) {
        y -= step
    }

    fun moveUp(step: Int) {
        y += step
    }
}

class Round1(private val radius: Double, color: String) : Figure1(color) {
    override fun area(): Double {
        return PI * (radius * radius)
    }


    override fun length(): Double {
        return 2 * (PI * radius)
    }

}

class Rectangle1(private val width: Double, private val height: Double, color: String) : Figure1(color) {
    private var isSquare = false
    override fun area(): Double {
        return (round(width * height * 10)) / 10
    }

    override fun length(): Double {
        return 2 * (width + height)
    }

    fun isSquare(): Boolean {
        if (width == height)
            isSquare = true
        return isSquare
    }

}


class Triangle1(
    private val a: Double,
    private val b: Double,
    private val c: Double,
    private val h: Double,
    color: String
) : Figure1(color) {
    override fun area(): Double {
        return 0.5*c*h
    }

    override fun length(): Double {
        return a + b + c
    }
}