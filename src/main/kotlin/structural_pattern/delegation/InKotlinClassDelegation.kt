package structural_pattern.delegation

//https://jisungbin.medium.com/%EC%BD%94%ED%8B%80%EB%A6%B0-by-%ED%82%A4%EC%9B%8C%EB%93%9C-%EC%95%8C%EC%95%84%EB%B3%B4%EA%B8%B0-54aa7252febb

interface Speaker {
    val subject: String
    val script: String
    fun say()
}

class AndroidSpeaker : Speaker {
    override val subject = "Android"
    override val script = """
        안녕하세요, $subject 를 발표하겠습니다.
        ...
    """.trimIndent()

    override fun say() {
        println("[$subject] $script")
    }
}

class SpeakerImpl(private val presentation: Speaker) : Speaker {
    override val subject = presentation.subject
    override val script = presentation.script
    override fun say() {
        presentation.say()
    }
}

class SpeakerImplBy(private val presentation: Speaker) :  Speaker by presentation

fun main() {
    val androidSpeaker = AndroidSpeaker()
    val sejin1 = SpeakerImpl(androidSpeaker)
    sejin1.say()

    val sejin2 = SpeakerImplBy(androidSpeaker)
    sejin2.say()

}