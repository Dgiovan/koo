
fun main(args: Array<String>){

/*    var x = 10
    while (x<10)
    {
        println(x)
        x++
    }*/
    escribir(" gio")
    println(suma(1,3))
    var cadena = "Hola mundo que     tal con l o s espacios"
    println(cadena.Quitarespacios())
    //se puede mandar a llamar un funcion con nombres  por buena practia como se muestra en el siguiente ejemplo
    Datos(nombre="gio",dia=4,mes=12,año=1995)
    //funcion con multiples argumentos ejemplos
    //mArgumentos("gio")
    mArgumentos("mayra","Angel","Damian")
    //funciones por defecto
    Saludar("gio")
    Saludar("pedro","corona")
}
//funcion sin parametros
fun Saluda(){
    println("bienvenido")
}
//funcion con parametros
fun escribir(x:String )
{
    println("hola" + x)
}
//funcion con parametros y retorno
fun suma(x:Int,y:Int):Int
{
    var miSuma = x+y
    return miSuma
}
//funciones de exprecion simple
/*
funcion normal          funcion on reduccion
fun Doble(n:Int):Int{  fun Doble(n:Int):Int{
    var x = n*2        return n*2
    return x                                }
}*/
//funcion de exprecion simple
fun Doble(n:Int) = n*2

//funcion generica
fun <T> generica (n:T)
{
}
//funciones de extencion
fun String.Quitarespacios():String{
    var regex = Regex("\\s+")
    return regex.replace(this,"")
}
//funciones con nombre

fun Datos(nombre:String,dia:Int,mes:Int,año:Int)
{
}
//Variables con multiples argumentos
//vararg in dica que trabajara con una variable Estatica pero con Xn cantidad de argumentos
fun mArgumentos(vararg nombres:String)
{
    for (nombre in nombres)
    {
        println(nombre)
    }
}
//funciones con valores por defecto
fun Saludar(nombre:String, apellido:String="default")
{
    println(nombre + apellido)
}
