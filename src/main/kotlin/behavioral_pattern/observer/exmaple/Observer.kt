package behavioral_pattern.observer.exmaple

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}