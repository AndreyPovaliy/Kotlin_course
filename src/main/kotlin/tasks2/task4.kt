import kotlin.math.PI
import kotlin.math.round

/*
1. Создайте интерфейс Movable (перемещаемый), в котором будут описаны функции moveLeft(step: Int),
moveRight(step: Int), moveDown(step: Int), moveUp(step: Int).

Сделайте так, чтобы класс Figure из предыдущего задания реализовывал интерфейс Movable

2. Создайте класс Animal с полями name: String, x: Int, y: Int,
который также будет реализовывать интерфейс Movable.

3. Создайте коллекцию перемещаемых объектов среди которых будут разные
геометрические фигуры и животные. Переместить все элементы коллекции вправо на 10 шагов*/


fun main() {
    val animal1 = Animal("Dog", 1, 2)
    val triangle2 = Triangle2(2.4, 3.4, 4.4, 5.4, "red")

    val movables = listOf<Movable>(animal1,triangle2)

    for (movable in movables)
        movable.moveRight(10)



}

interface Movable {
    fun moveLeft(step: Int)

    fun moveRight(step: Int)

    fun moveDown(step: Int)

    fun moveUp(step: Int)
}

abstract class Figure2(val color: String) : Movable {
    private var x: Int = 0
    private var y: Int = 0

    abstract fun area(): Double

    abstract fun length(): Double
    override fun moveLeft(step: Int) {
        x -= step


    }

    override fun moveRight(step: Int) {
        x += step

    }

    override fun moveDown(step: Int) {
        y -= step
    }

    override fun moveUp(step: Int) {
        y += step
    }
}

class Animal(name: String, x: Int, y: Int) : Movable {
    private var x: Int = 0
    private var y: Int = 0
    override fun moveLeft(step: Int) {
        x -= step


    }

    override fun moveRight(step: Int) {
        x += step

    }

    override fun moveDown(step: Int) {
        y -= step
    }

    override fun moveUp(step: Int) {
        y += step
    }

}

class Round2(private val radius: Double, color: String) : Figure2(color) {
    override fun area(): Double {
        return PI * (radius * radius)
    }


    override fun length(): Double {
        return 2 * (PI * radius)
    }

}

class Rectangle2(private val width: Double, private val height: Double, color: String) : Figure2(color) {
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


class Triangle2(
    private val a: Double,
    private val b: Double,
    private val c: Double,
    private val h: Double,
    color: String
) : Figure1(color), Movable {
    override fun area(): Double {
        return 0.5 * c * h
    }

    override fun length(): Double {
        return a + b + c
    }
}