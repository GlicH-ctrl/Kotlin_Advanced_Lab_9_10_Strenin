class User {
    var age: Int = 0
        set(value) {
            if (value in 0..150) {
                field = value
            } else {
                println("Ошибка: возраст должен быть от 0 до 150")
            }
        }
}