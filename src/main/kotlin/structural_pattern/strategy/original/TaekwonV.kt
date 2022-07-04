package structural_pattern.strategy.original

class TaekwonV(name: String) : Robot(name) {
    override fun attack() {
        println("Missiles")
    }

    override fun move() {
        println("I can only walk")
    }
}