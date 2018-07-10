package observeranswer;

public class ForecastDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Forecast display: temperature = "+temperature+", pressure = "+pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }
}
