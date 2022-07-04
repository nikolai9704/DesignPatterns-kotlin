package structural_pattern.strategy.improved

// 로봇 자체가 캡슐화된 단위이므로 로봇 추가는 쉽지만, 공격과 이동 수정할 때 또 문제 생긴다.
// 이렇게 너무 자주 바뀌니까 분리해서 위임시키자. 
class NewRobot(name :String) : Robot(name){
}