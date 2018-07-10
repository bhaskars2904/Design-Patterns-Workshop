package observeranswer;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions display: temperature = "+temperature+", humidity = "+humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }
}
