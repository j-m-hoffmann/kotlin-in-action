package ch05.ex2_4_1_FlatMapFlatten

fun main() {
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
}
