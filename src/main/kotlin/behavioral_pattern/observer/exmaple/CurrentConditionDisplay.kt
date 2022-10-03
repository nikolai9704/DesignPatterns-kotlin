package behavioral_pattern.observer.exmaple

class CurrentConditionDisplay(weatherData: WeatherData) : DisplayElement, Observer {
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var weatherData: WeatherData

    init {
        this.weatherData = weatherData
        weatherData.registerObserver(this)
    }

    override fun display() {
        println("condition: $temperature F degrees and $humidity % humidity")
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }
}