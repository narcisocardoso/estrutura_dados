package aula28

fun main() {
    println("Aula 28")

    helloWorld()
    println("A soma de 3 + 4 = ${sum(3,4)}")

    helloWorld2()
    println("A soma de 55 + 4 = ${sum2(55,4)}")

    println(divisao(30f, 15f))
}

fun sum (a: Int, b: Int): Int {
    return a + b
}

fun sum2 (a: Int, b: Int) = a + b

fun helloWorld() {
    println("Hello World")
}
fun helloWorld2() = println("Hello World2")

fun divisao(a: Float, b: Float) = a / b