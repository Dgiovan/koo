
fun main (args: Array<String>){
    var gasolina:Boolean = true

    if(gasolina){
        println("Vamonos ")
    }else{
        println("Sin conbustible")
    }
    //ahora se puden usar expreciones
    
    if(gasolina is Boolean) println("pos si") else println("no bue")

    //when ahora es similar al swich case
    var x = 11
    when(x)
    {
        in 1..3->{
            // para evaluar un rango se utiliza in Xn .. Xnf los dos puntos denotan el rango
            println("es igual a un rango entre 1 y 3")
        }
        6->{ println("es igual a 6") }
        5,11,13->{ println("numero espesifico") }
        is Int->{
            //is tambien se puede usar en su forma negativa !is
            println("lo es lo es ") }
        else -> {println("no es ninguno o por defecto") }
    }

}