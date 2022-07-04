package structural_pattern.strategy.original

fun main(){
    val taekwonV = TaekwonV("TaekwonV")
    val atom = Atom("Atom")

    println("my name is" + taekwonV.getName())
    taekwonV.attack()
    taekwonV.move()

    println("my name is" + atom.getName())
    atom.attack()
    atom.move()


}
