package structural_pattern.strategy.improved

fun main(){
    val taekwonV = TaekwonV("TaekwonV")
    val atom = Atom("Atom")

    taekwonV.movingStrategy = WalkingStrategy()
    taekwonV.attackStrategy = PunchStrategy()
    atom.movingStrategy = FlyingStrategy()
    atom.attackStrategy = MissileStrategy()

    println("my name is" + taekwonV.name)
    taekwonV.attack()
    taekwonV.move()

    println("my name is" + atom.name)
    atom.attack()
    atom.move()

}
