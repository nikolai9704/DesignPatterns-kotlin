package structural_pattern.strategy.original

abstract class Robot (private val name: String) {
    fun getName(): String = name
    abstract fun attack()
    abstract fun move()
}