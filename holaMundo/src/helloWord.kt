fun main(args: Array<String>){
    println("Hola kotlin")
    // a esto se e llama tipado estatico
 /*   formas
    var x:Int o bien
    var x=1  <-- esto se le llama inferencia
    var y:Int = 2*/
    var Entera:Int
    var doble:Double
    var flotante:Float = 2.3f
    var Cadena:String
    var Boleana:Boolean
    var arrego:Array<String>
    var listadearreglos:ArrayList<String>

    //Constantes
    val x=1
    //x=2 esto ya no se puede val identifica a una constante
    // objetivo de kotlin codigo claro y pequeño

    //casteos
    var X=1
    var Y=2.1f
    X= Y.toInt()
    Cadena = X.toString()

    //declaracion de un arrego
    var arreglo = arrayOf(1,4,7,8,9)
    var arregloStrings = arrayOf("gio","mayra","aaron","damian")

    println(arregloStrings[3])

}