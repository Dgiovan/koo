fun main(args: Array<String>){

    var datoNulo:String? = null // a traves de signo "?" se habilita la existencia de un nulo a partir
                               // de este punto esta en nuestro control evitar errores porobjetos Nulos

    var carro = ClassH(10,20,"vw","azul")
    carro.modelos = "audi" //iguala a metodo set
    println(carro.modelos)//iguala a metodo get

    var visibilidades = ModView()
    visibilidades.x

}