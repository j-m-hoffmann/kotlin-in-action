package ch06.ex1_6_NotnullAssertions

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun main() {
    ignoreNulls(null)
}
