package chucknorris

fun main() {
    println("Input string:")
    val input = readln()
    println(input.chunked(1).joinToString(" "))
}