package behavioral_pattern.observer.exmaple

class WeatherData : Subject {
    private lateinit var observeres: MutableList<Observer>
    private var temperature: Float = 0f
    private var humidity: Float = 0f
    private var pressure: Float = 0f

    init {
        observeres = mutableListOf()
    }

    override fun registerObserver(o: Observer) {
        observeres.add(o)
    }

    override fun removeObserver(o: Observer) {
        observeres.remove(o)
    }

    override fun notifyObserver() {
        for (o in observeres) {
            o.update(temperature, humidity, pressure)
        }
    }

    fun setMeasureMents(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }

    fun measurementsChanged(){
        notifyObserver()
    }
}