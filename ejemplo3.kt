fun main(){
    println(sumaTradicional(6,5))
    val suma = {a:Int, b:Int -> a+b}
    println(suma(3,8))

}

fun sumaTradicional(a: Int, b: Int): Int {
    return a + b
}