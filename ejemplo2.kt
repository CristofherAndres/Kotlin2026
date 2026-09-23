fun main() {
    saludar()
    println("El cuadrao de 4 es: ${cuadrado(4)}")
    mostrarMensaje()
    mostrarMensaje("Mensaje de prueba")
}

// Funcion sin parametros y sin retorno
fun saludar() {
    println("Hola, Bienvenido a Kotlin")
}
// Funcion con 1 parametro y retorno
fun cuadrado(n: Int) = n * n

fun mostrarMensaje(mensaje: String = "Mensaje por defecto"){
    println(mensaje)
}