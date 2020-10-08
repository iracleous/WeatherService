package gr.codehub.service;

public interface WeatherService {
    double getTemperature(String location);
    void setTemperature(String location, double temperature);
}
