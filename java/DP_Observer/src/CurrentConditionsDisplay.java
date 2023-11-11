public class CurrentConditionsDisplay implements Observer{
    private int temp;
    private int humidity;

    public CurrentConditionsDisplay(Subject weatherStation){
        weatherStation.register(this);
    }

    @Override
    public void update(int temp, int humidity) {
        this.temp = temp;
        this.humidity = humidity;
        displayCurrent();
    }

    public void displayCurrent(){
        System.out.println("Current Temp: " + temp);
        System.out.println("Current Humidity: " + humidity);
    }
}
