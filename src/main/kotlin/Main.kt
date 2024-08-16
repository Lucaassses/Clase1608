import kotlin.random.Random

fun main() {

    var aleatorio : Int
    var cara = 0
    var sello = 0

    for (i in 1..20){
        aleatorio = Random.nextInt(2)

        if (aleatorio == 0)
            cara ++
        else if(aleatorio == 1)
            sello ++

    }
    println("Veces caidas en cara: $cara")
    println("Veces caidas en sello: $sello")










}