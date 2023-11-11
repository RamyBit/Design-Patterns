import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentConditionsDisplay= new CurrentConditionsDisplay(weatherStation);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);

        int randomTemp = getRandomInt(-10,40);
        int randomHumidity = getRandomInt(0,100);

        weatherStation.measurementsChange(randomTemp, randomHumidity);

        Thread.sleep(1000);
        }

    private static int getRandomInt(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(max +1 - min) + min;
    }
}
