data class OutpostResource(val id: Int, val name: String, var amount: Int) {
    override fun toString(): String {
        return "Ресурс: $id | Имя: $name | Количество: $amount"
    }
}

fun main() {
    val minerals = OutpostResource(1, "Minerals", 300)
    val gas = OutpostResource(2, "Gas", 100)

    println(minerals)
    println(gas)

    val bonusMinerals = minerals.copy(amount = minerals.amount + 50)
    println("С бонусом: $bonusMinerals")
}