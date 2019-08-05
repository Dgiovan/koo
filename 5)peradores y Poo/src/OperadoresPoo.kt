
fun main(args: Array<String>){
    //Operadores                     operadores Especificos
 /* + suma                           in .dentro o perteneciente de
    - resta                          operador invoke .Este sepuede tomar para agregarlo a una funcion para poder ser invocada
    * multiplicacion
    / divicion
    % modulo
    > mayor que
    < menor que
    >= mayor igual que
    <= menor igual que*/

    var x = 1..10
    println(8 in x)//valor impreso true
    println(X()(2,8))
}

class X()
{
    //funcion del objeto mismo
    operator fun invoke(n:Int):Int = n+1
    operator fun invoke(n:Int,n2:Int):Int = n+n2
}