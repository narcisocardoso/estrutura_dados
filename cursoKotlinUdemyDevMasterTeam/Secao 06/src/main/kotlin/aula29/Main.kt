package aula29

fun main () {
    println("Aula 29")

    val str = "Programação Kotlin"

    println("tamanho da string ${str.length}")

    println("A posição (index) 0 da String é:  ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))

    println(str.substring(2,4))

    println(str.replace("kotlin", "Kotlin é show"))
    println(str.lowercase())
    println(str.uppercase())


   println("                        ,eu nome é         ".trim())

}