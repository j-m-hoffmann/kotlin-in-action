package ch08.ex3_2_3_ReturningFromLambdas2

fun main() {
    println(StringBuilder().apply sb@{
       listOf(1, 2, 3).apply {
           this@sb.append(this.toString())
       }
    })
}
