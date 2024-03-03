package areas

import kotlin.time.times

/* Programa que calcula a área de um Retangulo*/
fun main(args: Array<String>) {
    println("Programa que calcula a área de um retângulo::")
    Calcular(a = 0.0, b = 0.0)

}
fun Calcular(a: Double, b: Double): Double {
    var PrimeiroValor: Double?
    var SegundoValor: Double?

    println("Digite o primeiro valor do retângulo::")
    PrimeiroValor = readLine()!!.toDoubleOrNull()
    println("Digite o segundo valor do retângulo::")
    SegundoValor = readLine()!!.toDoubleOrNull()

    val AreaRetangulo: Double? = (PrimeiroValor!!.times(SegundoValor!!))
    println("$PrimeiroValor * $SegundoValor = $AreaRetangulo")
    println("A área do retângulo é igual a: $AreaRetangulo")
    return (AreaRetangulo!!)
}