package aula27

fun main() {
    println("Aula 27")
    helloWorld()

    println("A soma de 3 + 4 = ${sum(3,4)}")
}

fun sum (a: Int, b: Int): Int {
    return a + b
}

fun helloWorld() {
    println("Hello World")
}