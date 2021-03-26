package ch09.ex2_1_2_GenericsAtRuntimeTypeChecksAndCasts1

fun printSum(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

fun main() {
    printSum(listOf(1, 2, 3))
}
