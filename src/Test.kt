data class Item(val id: Int, val name: String, var quantity: Int) {
    override fun toString(): String {
        return "Предмет: $name | ID: $id | Количество: $quantity"
    }
}

fun main() {
    val item1 = Item(1, "Меч", 5)
    val item2 = item1.copy(quantity = 10)

    println(item1)
    println(item2)

    val (id, name, quantity) = item1
    println("Декомпозиция: id=$id, name=$name, quantity=$quantity")
}