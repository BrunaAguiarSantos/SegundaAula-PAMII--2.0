package areas

import kotlin.math.sqrt

fun main(args: Array<String>){
    println("\nPrograma que calcula a área de uma circunferência::")
    CalculoCirc(a = 0.0)
}

fun CalculoCirc(a: Double ): Double?{
    var ValorCirc: Double?

    println("Insira o valor do raio da circunferência(r)")
    ValorCirc = readLine()!!.toDoubleOrNull()

    //Calculo para achar a área com base na circunferência
    val AreaICirc: Double? = 3.14 .times(Math.pow(ValorCirc!!,2.0))
    println("$ValorCirc² * 3,14 = $AreaICirc cm²")
    println("A área da circunferência é igual a: $AreaICirc cm²")
    return (AreaICirc!!)
}
