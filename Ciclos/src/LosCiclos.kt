fun main(args: Array<String>){
    var nombres = arrayOf("damian","mayra","gio")
    var letras = listOf("a","b","c")

    for (letra in letras){
        //al agregarle letras.indice seobtiene el indice
        println(letra)
    }
    for (indice in nombres.indices){
        println(  "${indice}"  + "${nombres[indice]}")
    }
    //trabajando con rangos
    for (x in 1..10){
        println(x)
    }
    //trabajo con step (pasos)
    for (y in 1..20 step 2) {
        println(y)
    }
    //trabajando con downTo decrementos en este caso se tiene que utilizar el valor maximo ejemplo
    // el decremento es hasta donde bajara
    for (z in 20 downTo -10 step 10)
    {//downTo hasta donde llegara step en que canidad o pasos
        println(z)
    }

}