package observer;

import observer.contracts.Observer;
import observer.contracts.Subject;
import observer.models.User;
import observer.models.WeatherStation;

public class Application {
    public static void main(String[] args) {
        Subject weatherStation = new WeatherStation();

        Observer user = new User("Nikolay", "Nikolaev", "nikolayyynikolaevvv@gmail.com");

        weatherStation.register(user);
        user.setSubject(weatherStation);

        weatherStation.addTemperature(30);
        weatherStation.addTemperature(24);
        weatherStation.addTemperature(10);
    }
}
