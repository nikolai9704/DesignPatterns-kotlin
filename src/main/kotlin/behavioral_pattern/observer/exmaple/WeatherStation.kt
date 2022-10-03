package behavioral_pattern.observer.exmaple

fun main() {
    val weatherData = WeatherData()
    val display = CurrentConditionDisplay(weatherData)
    weatherData.setMeasureMents(1f,1f,1f)
    weatherData.setMeasureMents(1f,1f,1f)
    weatherData.setMeasureMents(1f,1f,1f)
}