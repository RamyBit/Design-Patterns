import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private int temp;
    private int humidity;

    public WeatherStation(){ this.observers = new ArrayList<>();}

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        if (observers.indexOf(o) >= 0){
            observers.remove(observers.indexOf(o));
        }
    }

    @Override
    public void notifyObserver() {
        observers.forEach(o -> o.update(temp, humidity));
    }
    public void measurementsChange(int temp, int humidity){
        this.temp = temp;
        this.humidity = humidity;
        notifyObserver();
    }
}

