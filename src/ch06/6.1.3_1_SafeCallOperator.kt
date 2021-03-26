package ch06.ex1_3_1_SafeCallOperator

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun main() {
    printAllCaps("abc")
    printAllCaps(null)
}
