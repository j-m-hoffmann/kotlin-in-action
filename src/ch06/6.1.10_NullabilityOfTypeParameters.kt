package ch06.ex1_10_NullabilityOfTypeParameters

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun main() {
    printHashCode(null)
}
