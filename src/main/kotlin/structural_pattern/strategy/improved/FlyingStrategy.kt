package structural_pattern.strategy.improved

class FlyingStrategy : MovingStrategy {
    override fun move() {
        println("fly")
    }

}