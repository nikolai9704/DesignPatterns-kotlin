package structural_pattern.strategy.improved

abstract class Robot (val name: String) {
    lateinit var attackStrategy : AttackStrategy
    lateinit var movingStrategy: MovingStrategy
    fun attack() {
        attackStrategy.attack()
    }
    fun move() {
        movingStrategy.move()
    }
}