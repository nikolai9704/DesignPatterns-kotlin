package structural_pattern.adapter


class HtmlParser(val file: String) {
    fun parseHtml() {
        println("htmlParser: parsing $file")
    }
}

class HangulParser() {
    fun parseHangul(file: String) {
        println("hanguleParser: parsing $file")
    }
}

interface ParserAdapter {
    fun parse()
}

class HtmlAdapter(file: String) : ParserAdapter {
    private val htmlParser = HtmlParser(file)
    // 객체 어댑터: 객체의 연산 그대로 이용
    // 클래스 어댑터의 경우는
    // html파서의 인터페이스를 상속받고 어댑터에서 재정의
    override fun parse() {
        htmlParser.parseHtml()
    }
}

class HangulAdapter(val file: String) : ParserAdapter {
    private val hangulParser = HangulParser()
    override fun parse() {
        hangulParser.parseHangul(file)
    }

}

class User {
    fun doing() {
        val html = "<html>ele</html>"
        val hangul = "가나다라마바사아"
        // 인터페이스가 다름.
        HtmlParser(html).parseHtml()
        HangulParser().parseHangul(hangul)

        // 같은 인터페이스로 사용 가능
        val htmlAdapter: ParserAdapter = HtmlAdapter(html)
        val hangulAdapter: ParserAdapter = HangulAdapter(hangul)

        htmlAdapter.parse()
        hangulAdapter.parse()
    }
}

fun main() {
    User().doing()
}