fun main(){
    //var = variable mutable
    var contador = 1
    println("Contador: $contador")

    contador++ // contador = contador + 1 o contador += 1
    println("Contador: $contador")

    //val = variable inmutable
    val limite = 10
    println("Limite: $limite")

    //intentar modificar una variable inmutable
    //limite++ // Esto generará un error de compilación

}