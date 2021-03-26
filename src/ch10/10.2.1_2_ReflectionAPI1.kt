package ch10.ex2_1_2_ReflectionAPI1

fun foo(x: Int) = println(x)

fun main() {
    val kFunction = ::foo
    kFunction.call(42)
}
