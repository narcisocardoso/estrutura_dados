package aula31

fun main() {
    println("Aula 31: ")
    dataCalculator(2)

}

fun dataCalculator(anos: Int) {
    println("$anos anos equivalem a:")
    println("${anos * 12} meses" )
    println("${anos * 365} dias" )
    println("${anos * 365 * 24} horas" )
    println("${anos * 365 * 24 * 60} minutos" )
    println("${anos * 365 * 24 * 60 * 60} segundos")
}

fun caracteres(str: String): Int {
    return str.length
}
