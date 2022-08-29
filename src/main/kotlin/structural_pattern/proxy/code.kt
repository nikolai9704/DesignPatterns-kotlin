package structural_pattern.proxy

import java.util.stream.Collectors
import java.util.stream.IntStream

interface Image {
    fun displayImage()
}

class RealImage(private val fileName: String) : Image {
    init {
        loadFromDisk(fileName)
    }

    private fun loadFromDisk(fileName: String) {
        println("loading $fileName")
    }

    override fun displayImage() {
        println("displaying $fileName")
    }

}

class ProxyImage(private val fileName: String) : Image {
    var realImage: RealImage? = null

    override fun displayImage() {
        if (realImage == null) // RealImage가 아직 생성되어있지 않더라도 프록시를 통해 접근 가능
            realImage = RealImage(fileName)
        realImage!!.displayImage()

    }

}


fun main() {
    val image1 = ProxyImage("1.png")
    val image2 = ProxyImage("2.png")
    image1.displayImage()
    image2.displayImage()
}
