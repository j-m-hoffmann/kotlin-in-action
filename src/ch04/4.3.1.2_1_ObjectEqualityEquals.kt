package ch04.ex3_1_2_1_ObjectEqualityEquals

class Client(val name: String, val postalCode: Int)

fun main() {
    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)
    println(client1 == client2)
}
