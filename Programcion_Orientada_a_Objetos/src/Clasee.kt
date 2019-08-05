class Clasee (names:String) {
    //Contenido de una clase
    // 1)Propiedades o atributos
    // 2)Metodos

    var nombre:String = "" //Propiedad . Las propiedades deben ser inicializada
    var edad:Int = 24

    //el init un momento antes de creer un objeto ejecuta un codigo
    init {
        //se puede inicilizar como cualquier constructor normal
        println("primer constructo")
    }
    
    //para crear varios construuctores se ddebe indicar al bloque init y utilizar la palabra constructor en un principio
    constructor(names:String,otroParametro:String):this(names){
        println("segundo constructo")
    }
    fun avanzar() {
        println("Avanzando")
    }

    fun Retrocediendo (){
        println("En retroceso")
    }

}