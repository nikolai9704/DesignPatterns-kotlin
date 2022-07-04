package structural_pattern.strategy.original

class Atom(name: String) : Robot(name) {
    // 기존 공격과 이동 방법을 수정하고 싶으면 코드를 수정해야함. OCP 위배
    override fun attack() {
        println("punch !!")
    }

    override fun move() {
        println("i can flu")
    }
}