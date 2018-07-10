package observerquestion;

public class CurrentConditionsDisplay {
    float temperature;
    float humidity;
    float pressure;

    public void update(float temperature, float humidity, float pressure){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        display();
    }
    public void display(){
        System.out.println("Current conditions display: temperature = "+temperature+", humidity = "+humidity);
    }
}
