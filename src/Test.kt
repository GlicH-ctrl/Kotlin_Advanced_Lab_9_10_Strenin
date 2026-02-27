abstract class Human(val name: String) {
    fun hello() {
        println("Привет, я $name")
    }

    abstract fun work()
}

class Programmer(name: String) : Human(name) {
    override fun work() {
        println("$name пишет код")
    }
}

class Teacher(name: String) : Human(name) {
    override fun work() {
        println("$name учит студентов")
    }
}

abstract class Figure {
    abstract fun perimeter(): Float
    abstract fun area(): Float
}

class Rectangle(val width: Float, val height: Float) : Figure() {
    override fun perimeter(): Float {
        return 2 * (width + height)
    }

    override fun area(): Float {
        return width * height
    }
}

class Circle(val radius: Float) : Figure() {
    override fun perimeter(): Float {
        return 2 * 3.14f * radius
    }

    override fun area(): Float {
        return 3.14f * radius * radius
    }
}

fun main() {
    val programmer = Programmer("Анна")
    programmer.hello()
    programmer.work()

    val teacher = Teacher("Олег")
    teacher.hello()
    teacher.work()

    val rect = Rectangle(5f, 3f)
    println("Прямоугольник: периметр = ${rect.perimeter()}, площадь = ${rect.area()}")

    val circle = Circle(4f)
    println("Круг: периметр = ${circle.perimeter()}, площадь = ${circle.area()}")
}