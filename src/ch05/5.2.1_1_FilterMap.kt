package ch05.ex2_1_1_FilterMap

fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
}
