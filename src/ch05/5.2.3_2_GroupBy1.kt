package ch05.ex2_3_2_GroupBy1

fun main() {
    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
}
