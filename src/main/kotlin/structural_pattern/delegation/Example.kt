package structural_pattern.strategy

//class Rectangle(val width: Int, val height: Int){
//    fun area() = width * height
//}
//
//class Window(val bound: Rectangle){
//    fun area() = bound.area()
//}

// language support

interface ClassShaped{
    fun area(): Int
}
class Rectangle(val width: Int, val height: Int): ClassShaped{
    override fun area() = width * height
}
// interface 생성이 위임될 수 있다.
class Window(private val bounds: ClassShaped): ClassShaped by bounds

fun main() {
    val rectangle = Rectangle(10,12)
    val window = Window(rectangle)
    println(window.area())

}