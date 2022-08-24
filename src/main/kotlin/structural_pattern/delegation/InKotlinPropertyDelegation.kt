package structural_pattern.delegation

import kotlin.reflect.KProperty

//https://jisungbin.medium.com/%EC%BD%94%ED%8B%80%EB%A6%B0-by-%ED%82%A4%EC%9B%8C%EB%93%9C-%EC%95%8C%EC%95%84%EB%B3%B4%EA%B8%B0-54aa7252febb

class CustomString {
    private var value = ""


    operator fun getValue(thisRef: Any?, property: KProperty<*>) = "[CustomString] $value"

    // A.B = "C"
    // thisRef : 호출된 인스턴스
    // property: 호출된 프로퍼티
    // value: 사용된 값
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        this.value = value
    }
}

class Delegate {
    var value = ""
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me! value is $value"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        this.value = value
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

class DelegateExample() {
    var pr: String by Delegate()
}


fun main() {
//    var customString by CustomString()
    var str: String by CustomString()
    str = "Bye World"
    println(str)

    var example = DelegateExample()
    example.pr = "123"
    println(example.pr)


}