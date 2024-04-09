package tasks2


import kotlin.math.round

/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.

Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))

Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)

Создайте объект класса Rectangle и проверьте работоспособность написанных функций*/



fun main() {

    val rectangle1 = Rectangle(4.5,1.2)
    println(rectangle1.calculateArea())
    println(rectangle1.calculatePerimeter())
    println(rectangle1.isSquare())
}

class Rectangle(val width: Double, val height: Double) {
    private var isSquare = false
    fun calculateArea(): Double {
        return (round(width * height*10))/10
    }

    fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }

    fun isSquare(): Boolean {
        if (width == height)
            isSquare = true
        return isSquare
    }

}