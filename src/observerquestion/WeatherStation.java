package observerquestion;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(1.1f,4,5);
        //See the problem of adding more observers which require a change in implementation of WeatherData Class.
        //Create a loosely coupled design where any observer could subscribe and unsubscribe to Weather Data, also
        //ensure programming to an interface and not to an implementation and segregate that which is different from what remains
        //the same.
    }
}
