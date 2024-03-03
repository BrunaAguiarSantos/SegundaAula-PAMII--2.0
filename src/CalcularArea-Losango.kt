package areas

import kotlin.math.sqrt

fun main(args: Array<String>){
    println("\nPrograma que calcula a área do losango::")
    CalculoLosango(a = 0.0, b = 0.0)
}

fun CalculoLosango(a: Double, b:Double ): Double?{
    var ValorDiagonal1: Double?
    var ValorDiagonal2: Double?

    println("Insira o valor da primeira diagonal (D)")
    ValorDiagonal1 = readLine()!!.toDoubleOrNull()

    println("Insira o valor da segunda diagonal (d)")
    ValorDiagonal2 = readLine()!!.toDoubleOrNull()

    //Calculo para achar a área do losango
    val AreaLosango: Double? = (ValorDiagonal1!!.times(ValorDiagonal2!!))/2
    println("($ValorDiagonal1 * $ValorDiagonal2) / 2= $AreaLosango cm²")
    println("A área do losango é igual a: $AreaLosango cm²")
    return (AreaLosango!!)
}
